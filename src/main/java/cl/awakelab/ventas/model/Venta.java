package cl.awakelab.ventas.model;

public class Venta {

	private int id;
	private long numeroBoleta;
	private String fecha;
	private Cliente cliente;
	private float monto;
	
	public Venta() {
		
	}
	
	public Venta(int id, long numeroBoleta, String fecha, Cliente cliente, float monto) {
		super();
		this.id = id;
		this.numeroBoleta = numeroBoleta;
		this.fecha = fecha;
		this.cliente = cliente;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumeroBoleta() {
		return numeroBoleta;
	}

	public void setNumeroBoleta(long numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
}
