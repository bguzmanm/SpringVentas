package cl.awakelab.ventas.model.DAO;

import cl.awakelab.ventas.model.Cliente;

public class ClienteDAO {

	/*CRUD - Create, Read, Update, Delete*/
	public Cliente readOne(int id){
		Cliente c = null;
		if (id == 0) {
			c = new Cliente(0, "1-1", "Luciana", "Liguori");
		} else {
			c = new Cliente(1, "2-2", "Cesar", "Celimen");
		}
		
		return c;
		
	}
	
}
