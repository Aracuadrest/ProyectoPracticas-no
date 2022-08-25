package modelo;

import java.util.Objects;

public class Tarifa_fijo {

	private int id_tarifa_fijo;
	private String tipo_tarifa;
	private String nombre_tarifa;
	private int id_operador;
	private String minutos_nacionales;
	private String minutos_internacionales;
	private float precio;
	private float precio_promocion;
	private float precio_pack;
	private String duracion_promocion;
	
	
	public Tarifa_fijo() {
	}


	public Tarifa_fijo(int id_tarifa_fijo, String tipo_tarifa, String nombre_tarifa, int id_operador,
			String minutos_nacionales, String minutos_internacionales, float precio, float precio_promocion,
			float precio_pack, String duracion_promocion) {
		this.id_tarifa_fijo = id_tarifa_fijo;
		this.tipo_tarifa = tipo_tarifa;
		this.nombre_tarifa = nombre_tarifa;
		this.id_operador = id_operador;
		this.minutos_nacionales = minutos_nacionales;
		this.minutos_internacionales = minutos_internacionales;
		this.precio = precio;
		this.precio_promocion = precio_promocion;
		this.precio_pack = precio_pack;
		this.duracion_promocion = duracion_promocion;
	}


	public int getId_tarifa_fijo() {
		return id_tarifa_fijo;
	}


	public void setId_tarifa_fijo(int id_tarifa_fijo) {
		this.id_tarifa_fijo = id_tarifa_fijo;
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


	public String getMinutos_nacionales() {
		return minutos_nacionales;
	}


	public void setMinutos_nacionales(String minutos_nacionales) {
		this.minutos_nacionales = minutos_nacionales;
	}


	public String getMinutos_internacionales() {
		return minutos_internacionales;
	}


	public void setMinutos_internacionales(String minutos_internacionales) {
		this.minutos_internacionales = minutos_internacionales;
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


	@Override
	public String toString() {
		return "Tarifas_fijo [id_tarifa_fijo=" + id_tarifa_fijo + ", tipo_tarifa=" + tipo_tarifa + ", nombre_tarifa="
				+ nombre_tarifa + ", id_operador=" + id_operador + ", minutos_nacionales=" + minutos_nacionales
				+ ", minutos_internacionales=" + minutos_internacionales + ", precio=" + precio + ", precio_promocion="
				+ precio_promocion + ", precio_pack=" + precio_pack + ", duracion_promocion=" + duracion_promocion
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_tarifa_fijo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa_fijo other = (Tarifa_fijo) obj;
		return id_tarifa_fijo == other.id_tarifa_fijo;
	}
	
	
	
	
	
	
}
