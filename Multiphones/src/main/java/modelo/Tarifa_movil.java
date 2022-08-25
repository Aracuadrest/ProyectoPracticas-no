package modelo;

import java.util.Objects;

public class Tarifa_movil {

	private int id_tarifa_movil;
	private String tipo_tarifa;
	private String nombre_tarifa;
	private int id_operador;
	private String gigas;
	private String minutos;
	private float precio;
	private float precio_promocion;
	private float precio_pack;
	private String duracion_promocion; 
	private boolean acumula;
	private boolean comparte;
	
	
	public Tarifa_movil() {
	}


	public Tarifa_movil(int id_tarifa_movil, String tipo_tarifa, String nombre_tarifa, int id_operador, String gigas,
			String minutos, float precio, float precio_promocion, float precio_pack, String duracion_promocion,
			boolean acumula, boolean comparte) {
		this.id_tarifa_movil = id_tarifa_movil;
		this.tipo_tarifa = tipo_tarifa;
		this.nombre_tarifa = nombre_tarifa;
		this.id_operador = id_operador;
		this.gigas = gigas;
		this.minutos = minutos;
		this.precio = precio;
		this.precio_promocion = precio_promocion;
		this.precio_pack = precio_pack;
		this.duracion_promocion = duracion_promocion;
		this.acumula = acumula;
		this.comparte = comparte;
	}


	public int getId_tarifa_movil() {
		return id_tarifa_movil;
	}


	public void setId_tarifa_movil(int id_tarifa_movil) {
		this.id_tarifa_movil = id_tarifa_movil;
	}


	public String getTipo_tarifa() {
		return tipo_tarifa;
	}


	public void setTipo_tarifa(String tipo_tarifa) {
		this.tipo_tarifa = tipo_tarifa;
	}


	public String getNombre_tarifa() {
		return nombre_tarifa;
	}


	public void setNombre_tarifa(String nombre_tarifa) {
		this.nombre_tarifa = nombre_tarifa;
	}


	public int getId_operador() {
		return id_operador;
	}


	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}


	public String getGigas() {
		return gigas;
	}


	public void setGigas(String gigas) {
		this.gigas = gigas;
	}


	public String getMinutos() {
		return minutos;
	}


	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public float getPrecio_promocion() {
		return precio_promocion;
	}


	public void setPrecio_promocion(float precio_promocion) {
		this.precio_promocion = precio_promocion;
	}


	public float getPrecio_pack() {
		return precio_pack;
	}


	public void setPrecio_pack(float precio_pack) {
		this.precio_pack = precio_pack;
	}


	public String getDuracion_promocion() {
		return duracion_promocion;
	}


	public void setDuracion_promocion(String duracion_promocion) {
		this.duracion_promocion = duracion_promocion;
	}


	public boolean isAcumula() {
		return acumula;
	}


	public void setAcumula(boolean acumula) {
		this.acumula = acumula;
	}


	public boolean isComparte() {
		return comparte;
	}


	public void setComparte(boolean comparte) {
		this.comparte = comparte;
	}


	@Override
	public String toString() {
		return "Tarifas_movil [id_tarifa_movil=" + id_tarifa_movil + ", tipo_tarifa=" + tipo_tarifa + ", nombre_tarifa="
				+ nombre_tarifa + ", id_operador=" + id_operador + ", gigas=" + gigas + ", minutos=" + minutos
				+ ", precio=" + precio + ", precio_promocion=" + precio_promocion + ", precio_pack=" + precio_pack
				+ ", duracion_promocion=" + duracion_promocion + ", acumula=" + acumula + ", comparte=" + comparte
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_tarifa_movil);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa_movil other = (Tarifa_movil) obj;
		return id_tarifa_movil == other.id_tarifa_movil;
	}
	
	
	
}

