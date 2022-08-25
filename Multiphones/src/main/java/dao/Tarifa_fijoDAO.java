package dao;

import java.util.List;

import modelo.Tarifa_fijo;

public interface Tarifa_fijoDAO {

	List<Tarifa_fijo>getTarifa_fijo();
	Tarifa_fijo getTarifa_fijo(int id_tarifa_fijo);
}
