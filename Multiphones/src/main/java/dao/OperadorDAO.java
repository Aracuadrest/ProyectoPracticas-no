package dao;

import java.util.List;

import modelo.Operador;

public interface OperadorDAO {

	List<Operador>getOperador();
	int eliminarOperador(int id_operador);
	Operador getOperador(int id_operador);
	int insertarOperador(Operador operador);
	int actualizarOperador(Operador operador);
}
