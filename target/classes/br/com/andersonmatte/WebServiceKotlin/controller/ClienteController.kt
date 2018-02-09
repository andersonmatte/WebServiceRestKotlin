package br.com.andersonmatte.WebServiceKotlin.controller

import br.com.andersonmatte.WebServiceKotlin.entidade.Cliente
import br.com.andersonmatte.WebServiceKotlin.repository.ClienteRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Anderson Matte
 *
 * Classe Cliente controler onde é implementado as regras de negócio do WebService.
 *
 */
@RestController
@RequestMapping("/clientes")
class ClienteController(val repository: ClienteRepository) {
	
	@GetMapping("/")
	fun recuperarTodos() = this.repository.findAll();
	
	@PostMapping("/post")
	fun inserirCliente(@RequestBody cliente: Cliente) = this.repository.save(cliente)
	
	@PutMapping("/put/{id}")
	fun  atualizarCliente(@PathVariable id: Long, @RequestBody cliente: Cliente) {
		assert(cliente.id == id)
		this.repository.save(cliente)		
	}
    
	@DeleteMapping("/delete/{id}")
	fun apagarCliente(@PathVariable id: Long) = this.repository.delete(id)
	
}