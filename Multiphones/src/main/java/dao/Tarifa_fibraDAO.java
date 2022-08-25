package dao;

import java.util.List;

import modelo.Tarifa_fibra;

public interface Tarifa_fibraDAO {
	List<Tarifa_fibra>getTarifa_fibra();
	Tarifa_fibra getTarifa_fibra(int id_tarifa_fibra);

}
