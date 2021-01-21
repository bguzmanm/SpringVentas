package cl.awakelab.ventas.model.DAO;

import java.util.List;

import cl.awakelab.ventas.model.Cliente;

/***
 * Define metodos CRUD para clase DAO 
 * @author brian
 *
 */
public interface IClienteDAO {

	public void create(Cliente c);
	public List<Cliente> readAll();
	public Cliente readOne(int id);
	public void update(Cliente c);
	public void delete(int id);
	
}
