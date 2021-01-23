package cl.awakelab.ventas.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.ventas.model.Cliente;

public class ClienteDAO implements IClienteDAO {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public void create(Cliente c) {
		String sql = "insert into customers (customer_id, name, address, website, credit_limit) values (?, ?, ?, ?, ?)";
		
		template.update(sql, new Object[]{c.getId(),c.getNombre(),c.getDireccion(),c.getWebsite(),c.getCredito()});
		
		
	}

	@Override
	public List<Cliente> readAll() {
	
		String sql = "select customer_id, name, address, website, credit_limit from customers order by customer_id asc";
		
		return template.query(sql,  new ClienteRowMapper());
	}

	@Override
	public Cliente readOne(int id) {
		String sql = "select customer_id, name, address, website, credit_limit from customers where customer_id = ? ";
		
		return template.queryForObject(sql, new Object[]{id}, new ClienteRowMapper());
		
		
	}

	@Override
	public void update(Cliente c) {
		String sql = "update customers set name = ?, address = ?, website = ?, credit_limit = ? where customer_id = ?";
		
		template.update(sql, new Object[]{c.getNombre(),c.getDireccion(),c.getWebsite(),c.getCredito(),c.getId()});
		
		
	}

	@Override
	public void delete(int id) {

		String sql = "delete from customers where customer_id = ? ";
		
		template.update(sql, new Object[] {id});
		
	}
	
	
}

class ClienteRowMapper implements RowMapper<Cliente>{
	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new Cliente(rs.getInt("customer_id"), rs.getString("name"), 
				rs.getString("address"), rs.getString("website"), rs.getDouble("credit_limit"));
	}
	
}

