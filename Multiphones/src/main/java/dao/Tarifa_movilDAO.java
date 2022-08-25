package dao;

import java.util.List;

import modelo.Tarifa_movil;

public interface Tarifa_movilDAO {

	List<Tarifa_movil>getTarifa_movil();
	Tarifa_movil getTarifa_movil(int id_tarifa_movil);
}
