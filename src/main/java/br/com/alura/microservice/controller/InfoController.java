package br.com.alura.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.model.InfoFornecedor;
import br.com.alura.microservice.service.InfoService;

@RestController
@RequestMapping("/infos")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public InfoFornecedor buscarInfoPorEstado(@PathVariable("estado") String estado) {
		return this.infoService.getInfoPorEstado(estado);
	}
	
}
