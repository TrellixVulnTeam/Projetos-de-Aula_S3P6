package br.com.cotiinformatica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

}
