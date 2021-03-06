package prematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prematricula.entity.Coordenador;
import prematricula.services.CoordenadorService;
import prematricula.facade.OrdenarServiceFacade;

@RestController
@RequestMapping("/api/coordenadores")
@CrossOrigin
public class CoordenadorController {

	@Autowired
	private OrdenarServiceFacade ordernarServiceFacade;
	
	
	@GetMapping("")
	public List<Coordenador> getCoordenadores(){
		return this.ordernarServiceFacade.findAllCoordenadores();
	}
	
}
