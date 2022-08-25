package dao;

import java.util.List;

import modelo.Cliente;

public interface ClienteDAO {

	List<Cliente>getCliente();
	int eliminarCliente(int id_cliente);
	Cliente getCliente(int id_cliente);
	int insertarCliente(Cliente cliente);
	int actualizarCliente(Cliente cliente);
}
