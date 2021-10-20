package br.com.alura.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.model.InfoFornecedor;
import br.com.alura.microservice.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
	
}
