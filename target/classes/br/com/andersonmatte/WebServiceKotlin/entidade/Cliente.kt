package br.com.andersonmatte.WebServiceKotlin.entidade

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author Anderson Matte 
 * 
 * Classe que representa a CLIENTE do BD.
 * 
 */
@Entity
data class Cliente(
		@Id @GeneratedValue(strategy = GeneratedValue.Auto)
		var id: Long? = null,
		var nomeCliente: String? = null,
	    var limiteCredito: Double? = null,
		var risco: String? = null,
		var taxaJuros: Long? = null) {
}