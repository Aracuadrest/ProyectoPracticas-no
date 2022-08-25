package modelo;

import java.util.Objects;

public class Operador {
	private int id_operador;
	private String nombre_operador;
	private String red_movil;
	private String red_fija;
	
	
	public Operador() {
		
	}


	public Operador(int id_operador, String nombre_operador, String red_movil, String red_fija) {
		this.id_operador = id_operador;
		this.nombre_operador = nombre_operador;
		this.red_movil = red_movil;
		this.red_fija = red_fija;
	}


	public int getId_operador() {
		return id_operador;
	}


	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}


	public String getNombre_operador() {
		return nombre_operador;
	}


	public void setNombre_operador(String nombre_operador) {
		this.nombre_operador = nombre_operador;
	}


	public String getRed_movil() {
		return red_movil;
	}


	public void setRed_movil(String red_movil) {
		this.red_movil = red_movil;
	}


	public String getRed_fija() {
		return red_fija;
	}


	public void setRed_fija(String red_fija) {
		this.red_fija = red_fija;
	}


	@Override
	public String toString() {
		return "Operadores [id_operador=" + id_operador + ", nombre_operador=" + nombre_operador + ", red_movil="
				+ red_movil + ", red_fija=" + red_fija + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_operador);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operador other = (Operador) obj;
		return id_operador == other.id_operador;
	}
	
	
}
