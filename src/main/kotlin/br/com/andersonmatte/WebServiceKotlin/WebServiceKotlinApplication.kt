package br.com.andersonmatte.WebServiceKotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Anderson Matte 
 * 
 * Classe principal que executa o serviço em Kotlin.
 * 
 */
@SpringBootApplication
open class WebServiceKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(WebServiceKotlinApplication::class.java, *args)
}
