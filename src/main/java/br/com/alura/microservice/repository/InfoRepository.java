package br.com.alura.microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	public InfoFornecedor findByEstado(String estado);
	
}
