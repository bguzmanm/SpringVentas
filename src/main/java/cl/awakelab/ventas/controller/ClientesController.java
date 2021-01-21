package cl.awakelab.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.ventas.model.Cliente;
import cl.awakelab.ventas.model.DAO.ClienteDAO;

@Controller
public class ClientesController {

	@Autowired
	ClienteDAO cDao;

	@RequestMapping(value="/clientes", method=RequestMethod.GET)
	public String clientes(Model modelo) {
		
		List<Cliente> clientes = cDao.readAll();		
		modelo.addAttribute("clientes", clientes);		
		return "clientes";
	}
	
}
