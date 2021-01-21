package cl.awakelab.ventas.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public String editar(Model modelo, @PathVariable("id") int id, @RequestParam("fechaVenta") String fechaVenta, @RequestParam("monto") String monto) {
		
		VentaDAO vDao = new VentaDAO();
		
		Venta v = vDao.readOne(id);
		
		v.setFecha(fechaVenta);
		v.setMonto(Float.parseFloat(monto));
		
		vDao.update(v);
			
		System.out.println("cambiando datos en registro de venta");
		System.out.println("Fecha de Venta:" + v.getFecha());
		System.out.println("Monto:" + v.getMonto());
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model modelo) {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)	
	public String login(Model modelo, @RequestParam("user") String user, @RequestParam("pass") String pass) {
		
		System.out.println("USR: " + user);
		System.out.println("PSW: " + pass);
		
		return "redirect:/";
	}
	/* ejemplo de expresiones regulares en patrones URI.*/
	@RequestMapping(value="/hola/{numero:\\d\\d}", method=RequestMethod.GET)
	public String muestra(Model modelo, @PathVariable("numero") int numero) {
		
		System.out.println("numero: " + numero);
		
		return "index";
	}

	
}
