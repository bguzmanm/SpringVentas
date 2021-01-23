package cl.awakelab.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	/***
	 * Muestra el formulario para editar un cliente. Despliega los datos actuales del registro 
	 * @param id
	 * @return Vista con datos del registro.
	 */
	
	@RequestMapping(value="/editCliente/{id}", method=RequestMethod.GET)
	public ModelAndView editarCliente(@PathVariable("id") int id) {
		
		Cliente cliente = cDao.readOne(id);
		
		return new ModelAndView("editCliente", "cliente", cliente);
		
	}
	
	/***
	 * Guarda los datos que vienen del formulario en la base de datos. 
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param website
	 * @param credito
	 * @return Redirige al controlador de lista de clientes.
	 */
	@RequestMapping(value="/editCliente/{id}", method=RequestMethod.POST)
	public ModelAndView editarCliente(@PathVariable("id") int id, @RequestParam("nombre") String nombre, @RequestParam("direccion") String direccion,
			@RequestParam("website") String website, @RequestParam("credito") String credito) {
		
		
		Cliente c = new Cliente(id, nombre, direccion, website, Double.parseDouble(credito));
		
		cDao.update(c);
		
		return new ModelAndView("redirect:/clientes");
		
	}
	
	@RequestMapping(value="/borrarCliente/{1}", method=RequestMethod.GET)
	public ModelAndView borrarCliente(@PathVariable("id") int id) {
		
		cDao.delete(id);
		
		return new ModelAndView("redirect:/clientes");
	}
	
}
