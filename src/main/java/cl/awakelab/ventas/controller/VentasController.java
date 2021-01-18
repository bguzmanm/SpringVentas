package cl.awakelab.ventas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.ventas.model.Venta;
import cl.awakelab.ventas.model.DAO.VentaDAO;

@Controller
public class VentasController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String inicio(Model modelo) {
		
		VentaDAO vDao = new VentaDAO();
		
		List<Venta> ventas = vDao.readAll();
		
		modelo.addAttribute("ventas", ventas);
		
		return "index";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String editar(Model modelo, @PathVariable("id") int id) {
		
		VentaDAO vDao = new VentaDAO();
		
		Venta v = vDao.readOne(id);
		
		modelo.addAttribute("venta", v);
		
		return "edit";
	}
	
}
