package modelo;

import java.util.Objects;

public class Tarifa_fibra {

	private int id_tarifa_fibra;
	private String tipo_tarifa;
	private String nombre_tarifa;
	private int id_operador;
	private int velocidad_fibra;
	private float precio;
	private float precio_promocion;
	private float precio_pack;
	private String duracion_promocion;
	private boolean fijo;
	
	
	public Tarifa_fibra() {
		
	}


	public Tarifa_fibra(int id_tarifa_fibra, String tipo_tarifa, String nombre_tarifa, int id_operador,
			int velocidad_fibra, float precio, float precio_promocion, float precio_pack, String duracion_promocion,
			boolean fijo) {
		this.id_tarifa_fibra = id_tarifa_fibra;
		this.tipo_tarifa = tipo_tarifa;
		this.nombre_tarifa = nombre_tarifa;
		this.id_operador = id_operador;
		this.velocidad_fibra = velocidad_fibra;
		this.precio = precio;
		this.precio_promocion = precio_promocion;
		this.precio_pack = precio_pack;
		this.duracion_promocion = duracion_promocion;
		this.fijo = fijo;
	}


	public int getId_tarifa_fibra() {
		return id_tarifa_fibra;
	}


	public void setId_tarifa_fibra(int id_tarifa_fibra) {
		this.id_tarifa_fibra = id_tarifa_fibra;
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


	public int getVelocidad_fibra() {
		return velocidad_fibra;
	}


	public void setVelocidad_fibra(int velocidad_fibra) {
		this.velocidad_fibra = velocidad_fibra;
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


	public boolean isFijo() {
		return fijo;
	}


	public void setFijo(boolean fijo) {
		this.fijo = fijo;
	}


	@Override
	public String toString() {
		return "Tarifas_fibra [id_tarifa_fibra=" + id_tarifa_fibra + ", tipo_tarifa=" + tipo_tarifa + ", nombre_tarifa="
				+ nombre_tarifa + ", id_operador=" + id_operador + ", velocidad_fibra=" + velocidad_fibra + ", precio="
				+ precio + ", precio_promocion=" + precio_promocion + ", precio_pack=" + precio_pack
				+ ", duracion_promocion=" + duracion_promocion + ", fijo=" + fijo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_tarifa_fibra);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa_fibra other = (Tarifa_fibra) obj;
		return id_tarifa_fibra == other.id_tarifa_fibra;
	}



	
	
	
}
