package cl.awakelab.ventas.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.ventas.model.Producto;

public class ProductoDAO implements IProductoDAO{
	
	JdbcTemplate template;
	
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void create(Producto p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> readAll() {

		String sql = "select product_id, product_name, description, standard_cost, list_price from products";
		
		
		return template.query(sql, new ProductoRowMapper());
	}

	@Override
	public Producto readOne(int id) {

		String sql = "select product_id, product_name, description, standard_cost, list_price from products where product_id = ? ";
		
		
		return template.queryForObject(sql, new Object[] {id}, new ProductoRowMapper());
	}

	@Override
	public void update(Producto p) {
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}

class ProductoRowMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Producto(rs.getInt("product_id"), rs.getString("product_name"),
				rs.getString("description"), rs.getDouble("standard_cost"), 
				rs.getDouble("list_price"));
	}
	
}