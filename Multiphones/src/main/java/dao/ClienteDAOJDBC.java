package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

import utilidades.ConexionBD;

public class ClienteDAOJDBC implements ClienteDAO {

	private ConexionBD conexion;
	private Statement consulta = null;
	private PreparedStatement consultaPreparada = null;
	private ResultSet resultado = null;
	
	
	public ClienteDAOJDBC() {
		conexion = new ConexionBD();
	}

	@Override
	public List<Cliente> getCliente() {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		Connection con = conexion.getConexion();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from clientes");
			while (resultado.next()) {
				int id_cliente = resultado.getInt("id_cliente");
				String nombre = resultado.getString("nombre");
				String apellidos = resultado.getString("apellidos");
				String dni = resultado.getString("dni");
				 String domicilio= resultado.getString("domicilio");
				 String localidad= resultado.getString("localidad");
				 String provincia= resultado.getString("provincia");
				 String cod_postal= resultado.getString("cod_postal");
				 Date fecha_nacimiento= resultado.getDate("fecha_nacimiento");
				 String telefono_contacto=resultado.getString("telefono_contacto");
				 String email =resultado.getString("email");
				 Date fecha_contratacion= resultado.getDate("fecha_contratacion");
				 Date permanencia= resultado.getDate("permanencia");
				 String telefono_tarifa =resultado.getString("telefono_tarifa");
				 int id_tarifa_movil=resultado.getInt("id_tarifa_movil");
				 int id_tarifa_fibra=resultado.getInt("id_tarifa_fibra");
				 int id_tarifa_movilYfibra=resultado.getInt("id_tarifa_movilYfibra");
				 int id_tarifa_fijo=resultado.getInt("id_tarifa_fijo");
				
				
				Cliente cliente = new Cliente(id_cliente, nombre, apellidos, dni, domicilio, 
						localidad, provincia, cod_postal, fecha_nacimiento, telefono_contacto, 
						email, fecha_contratacion, permanencia, telefono_tarifa, id_tarifa_movil,
						id_tarifa_fibra, id_tarifa_movilYfibra, id_tarifa_fijo);
				

				listaClientes.add(cliente);
			}
			System.out.println("Anadido todos los clientes: ");
			System.out.println(listaClientes);
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre Clientes: "+e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}

		
		return listaClientes;
	}

	@Override
	public int eliminarCliente(int id_cliente) {
		Connection con = conexion.getConexion();
		int resultado=0;
		
		try {
			consultaPreparada = con.prepareStatement("DELETE FROM clientes\r\n"
					+ "WHERE id_cliente = ?");
			
			consultaPreparada.setInt(1, id_cliente);
			resultado=consultaPreparada.executeUpdate();
			System.out.println("Cliente borrado correctamente: "+id_cliente);

		} catch (SQLException e) {
			System.out.println("Error al realizar el borrado de cliente: "+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
	}

	@Override
	public Cliente getCliente(int id_cliente) {
	
		Connection con = conexion.getConexion();
		Cliente cliente = null;
		
		try {
			consultaPreparada = con.prepareStatement("select * from clientes"
					+ " where id_cliente = ?");
			consultaPreparada.setInt(1, id_cliente);
			resultado=consultaPreparada.executeQuery();
			if (resultado.next()) {
				
				String nombre = resultado.getString("nombre");
				String apellidos = resultado.getString("apellidos");
				String dni = resultado.getString("dni");
				 String domicilio= resultado.getString("domicilio");
				 String localidad= resultado.getString("localidad");
				 String provincia= resultado.getString("provincia");
				 String cod_postal= resultado.getString("cod_postal");
				 Date fecha_nacimiento= resultado.getDate("fecha_nacimiento");
				 String telefono_contacto=resultado.getString("telefono_contacto");
				 String email =resultado.getString("email");
				 Date fecha_contratacion= resultado.getDate("fecha_contratacion");
				 Date permanencia= resultado.getDate("permanencia");
				 String telefono_tarifa =resultado.getString("telefono_tarifa");
				 int id_tarifa_movil=resultado.getInt("id_tarifa_movil");
				 int id_tarifa_fibra=resultado.getInt("id_tarifa_fibra");
				 int id_tarifa_movilYfibra=resultado.getInt("id_tarifa_movilYfibra");
				 int id_tarifa_fijo=resultado.getInt("id_tarifa_fijo");
				
				
				cliente = new Cliente(id_cliente, nombre, apellidos, dni, domicilio, 
						localidad, provincia, cod_postal, fecha_nacimiento, telefono_contacto, 
						email, fecha_contratacion, permanencia, telefono_tarifa, id_tarifa_movil,
						id_tarifa_fibra, id_tarifa_movilYfibra, id_tarifa_fijo);
				
				System.out.println("Cliente encontrado: "+cliente);
				
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre Clientes: "+e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}

		
		return cliente;
	}

	@Override
	public int insertarCliente(Cliente cliente) {
		Connection con = conexion.getConexion();
		int resultado=0;
		
		try {
			consultaPreparada = con.prepareStatement("INSERT INTO clientes (nombre, apellidos, dni, domicilio, \r\n"
					+ "						localidad, provincia, cod_postal, fecha_nacimiento, telefono_contacto, \r\n"
					+ "						email, fecha_contratacion, permanencia, telefono_tarifa, id_tarifa_movil,\r\n"
					+ "						id_tarifa_fibra, id_tarifa_movilYfibra, id_tarifa_fijo) "
					+ "VALUES "
					+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			consultaPreparada.setString(1, cliente.getNombre());
			consultaPreparada.setString(2, cliente.getApellidos()); 
			consultaPreparada.setString(3, cliente.getDni());
			consultaPreparada.setString(4, cliente.getDomicilio());
			consultaPreparada.setString(5, cliente.getLocalidad());
			consultaPreparada.setString(6, cliente.getProvincia());
			consultaPreparada.setString(7, cliente.getCod_postal());
			consultaPreparada.setDate(8, cliente.getFecha_nacimiento());
			consultaPreparada.setString(9, cliente.getTelefono_contacto());
			consultaPreparada.setString(10, cliente.getEmail());
			consultaPreparada.setDate(11, cliente.getFecha_contratacion());
			consultaPreparada.setDate(12, cliente.getPermanencia());
			consultaPreparada.setString(13, cliente.getTelefono_tarifa());
			consultaPreparada.setInt(14, cliente.getId_tarifa_movil());
			consultaPreparada.setInt(15, cliente.getId_tarifa_fibra());
			consultaPreparada.setInt(16, cliente.getId_tarifa_movilYfibra());
			consultaPreparada.setInt(17, cliente.getId_tarifa_fijo());
			
			resultado=consultaPreparada.executeUpdate();
			System.out.println("Cliente insertado: ");
			System.out.println(cliente);

		} catch (SQLException e) {
			System.out.println("Error al realizar la inserción del cliente: " + cliente
		        +e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
	}

	@Override
	public int actualizarCliente(Cliente cliente) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

}
