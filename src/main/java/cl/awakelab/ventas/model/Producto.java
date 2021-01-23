package cl.awakelab.ventas.model;

public class Producto {

	private int id;
	private String nombre;
	private String descripcion;
	private Double costo;
	private Double precio;
	
	public Producto() {
		
	}
	public Producto(int id, String nombre, String descripcion, Double costo, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}
