package modelo;
import java.sql.Date;
import java.util.Objects;

public class Cliente {

	private int id_cliente;
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String localidad;
	private String provincia;
	private String cod_postal;
	private Date fecha_nacimiento;
	private String telefono_contacto;
	private String email;
	private Date fecha_contratacion;
	private Date permanencia;
	private String telefono_tarifa;
	private int id_tarifa_movil;
	private int id_tarifa_fibra;
	private int id_tarifa_movilYfibra;
	private int id_tarifa_fijo;
	
	
	public Cliente() {
	}


	public Cliente(int id_cliente, String nombre, String apellidos, String dni, String domicilio, String localidad,
			String provincia, String cod_postal, Date fecha_nacimiento, String telefono_contacto, String email,
			Date fecha_contratacion, Date permanencia, String telefono_tarifa, int id_tarifa_movil, int id_tarifa_fibra,
			int id_tarifa_movilYfibra, int id_tarifa_fijo) {
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.provincia = provincia;
		this.cod_postal = cod_postal;
		this.fecha_nacimiento = fecha_nacimiento;
		this.telefono_contacto = telefono_contacto;
		this.email = email;
		this.fecha_contratacion = fecha_contratacion;
		this.permanencia = permanencia;
		this.telefono_tarifa = telefono_tarifa;
		this.id_tarifa_movil = id_tarifa_movil;
		this.id_tarifa_fibra = id_tarifa_fibra;
		this.id_tarifa_movilYfibra = id_tarifa_movilYfibra;
		this.id_tarifa_fijo = id_tarifa_fijo;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getCod_postal() {
		return cod_postal;
	}


	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getTelefono_contacto() {
		return telefono_contacto;
	}


	public void setTelefono_contacto(String telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getFecha_contratacion() {
		return fecha_contratacion;
	}


	public void setFecha_contratacion(Date fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}


	public Date getPermanencia() {
		return permanencia;
	}


	public void setPermanencia(Date permanencia) {
		this.permanencia = permanencia;
	}


	public String getTelefono_tarifa() {
		return telefono_tarifa;
	}


	public void setTelefono_tarifa(String telefono_tarifa) {
		this.telefono_tarifa = telefono_tarifa;
	}


	public int getId_tarifa_movil() {
		return id_tarifa_movil;
	}


	public void setId_tarifa_movil(int id_tarifa_movil) {
		this.id_tarifa_movil = id_tarifa_movil;
	}


	public int getId_tarifa_fibra() {
		return id_tarifa_fibra;
	}


	public void setId_tarifa_fibra(int id_tarifa_fibra) {
		this.id_tarifa_fibra = id_tarifa_fibra;
	}


	public int getId_tarifa_movilYfibra() {
		return id_tarifa_movilYfibra;
	}


	public void setId_tarifa_movilYfibra(int id_tarifa_movilYfibra) {
		this.id_tarifa_movilYfibra = id_tarifa_movilYfibra;
	}


	public int getId_tarifa_fijo() {
		return id_tarifa_fijo;
	}


	public void setId_tarifa_fijo(int id_tarifa_fijo) {
		this.id_tarifa_fijo = id_tarifa_fijo;
	}


	@Override
	public String toString() {
		return "Clientes [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", domicilio=" + domicilio + ", localidad=" + localidad + ", provincia=" + provincia + ", cod_postal="
				+ cod_postal + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono_contacto=" + telefono_contacto
				+ ", email=" + email + ", fecha_contratacion=" + fecha_contratacion + ", permanencia=" + permanencia
				+ ", telefono_tarifa=" + telefono_tarifa + ", id_tarifa_movil=" + id_tarifa_movil + ", id_tarifa_fibra="
				+ id_tarifa_fibra + ", id_tarifa_movilYfibra=" + id_tarifa_movilYfibra + ", id_tarifa_fijo="
				+ id_tarifa_fijo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_cliente);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id_cliente == other.id_cliente;
	}
	
	
	
	
	
	
	
}
