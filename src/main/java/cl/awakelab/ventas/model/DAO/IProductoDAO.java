package cl.awakelab.ventas.model.DAO;

import java.util.List;

import cl.awakelab.ventas.model.Producto;



public interface IProductoDAO {
	public void create(Producto p);
	public List<Producto> readAll();
	public Producto readOne(int id);
	public void update(Producto p);
	public void delete(int id);
}
