package com.tonn.api_calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tonn.api_calculadora.dto.CalculadoraRequisicao;
import com.tonn.api_calculadora.dto.CalculadoraResposta;
import com.tonn.api_calculadora.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
	@Autowired
	CalculadoraService servico;
	
	@PostMapping("/calculadora/somar")
	public CalculadoraResposta Soma(@RequestBody CalculadoraRequisicao requisicao){
		
		return servico.Somar(requisicao);
	}
	@PostMapping("/calculadora/subtrair")
	public CalculadoraResposta Subtrai(@RequestBody CalculadoraRequisicao requisicao){
		
		return servico.Subtrair(requisicao);
	}
	@PostMapping("/calculadora/dividir")
	public CalculadoraResposta Divide(@RequestBody CalculadoraRequisicao requisicao){
		
		return servico.Dividir(requisicao);
	}
	@PostMapping("/calculadora/multiplicar")
	public CalculadoraResposta Multiplica(@RequestBody CalculadoraRequisicao requisicao){
		
		return servico.Multiplicar(requisicao);
	}
	

	
	
}
