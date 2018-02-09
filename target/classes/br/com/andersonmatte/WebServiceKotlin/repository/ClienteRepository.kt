package br.com.andersonmatte.WebServiceKotlin.repository

import br.com.andersonmatte.WebServiceKotlin.entidade.Cliente
import org.springframework.data.repository.CrudRepository

/**
 * @author Anderson Matte 
 * 
 * Interface Cliente.
 * 
 */
interface ClienteRepository : CrudRepository<Cliente, Long>