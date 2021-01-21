package cl.awakelab.ventas.model.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.awakelab.ventas.model.Venta;

public class VentaDAO {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Venta> readAll() {

		List<Venta> ventas = new ArrayList<Venta>();

		ClienteDAO cDao = new ClienteDAO();

		ventas.add(new Venta(0, 143, "17 de Enero del 2021", cDao.readOne(0), 850000));
		ventas.add(new Venta(1, 243, "17 de Enero del 2021", cDao.readOne(1), 425000));

		ventas.add(new Venta(2, 321, "18 de Enero del 2021", cDao.readOne(0), 123413));
		ventas.add(new Venta(3, 478, "18 de Enero del 2021", cDao.readOne(1), 876554));

		return ventas;

	}

	public Venta readOne(int id) {

		Venta v = null;
		ClienteDAO cDao = new ClienteDAO();

		switch (id) {
			case 0:
				v = new Venta(0, 143, "17 de Enero del 2021", cDao.readOne(0), 850000);
				break;
			case 1:
				v = new Venta(1, 243, "17 de Enero del 2021", cDao.readOne(1), 425000);
				break;
			case 2:
				v = new Venta(2, 321, "18 de Enero del 2021", cDao.readOne(0), 123413);
				break;
			case 3:
				v = new Venta(3, 478, "18 de Enero del 2021", cDao.readOne(1), 876554);
				break;
			default:
				break;
		}

		return v;

	}

	public void update(Venta v) {
		
	}
	
}
