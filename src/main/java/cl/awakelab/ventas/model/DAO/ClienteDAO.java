package cl.awakelab.ventas.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> readAll() {
	
		String sql = "select customer_id, name, address, website, credit_limit from customers order by customer_id asc";
		
		return template.query(sql, new RowMapper<Cliente>() {
			public Cliente mapRow(ResultSet rs, int row) throws SQLException {
				//mapeo el objeto c (que es un Cliente), con el el contenido del ResultSet.
				Cliente c = new Cliente(rs.getInt("customer_id"), rs.getString("name"), 
						rs.getString("address"), rs.getString("website"), rs.getDouble("credit_limit"));
				
				return c;
			}			
		}) ;
	}

	@Override
	public Cliente readOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
