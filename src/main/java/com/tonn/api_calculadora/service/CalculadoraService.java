package com.tonn.api_calculadora.service;

import org.springframework.stereotype.Service;

import com.tonn.api_calculadora.dto.CalculadoraRequisicao;
import com.tonn.api_calculadora.dto.CalculadoraResposta;

@Service
public class CalculadoraService {

	public CalculadoraResposta Somar(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.n1 + requisicao.n2;
		return new CalculadoraResposta(requisicao.n1 , requisicao.n2, resultado);
	}
	
	public CalculadoraResposta Subtrair(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.n1 - requisicao.n2;
		return new CalculadoraResposta(requisicao.n1 , requisicao.n2, resultado);
		
	}
	public CalculadoraResposta Dividir(CalculadoraRequisicao requisicao) {
		double resultado;
		if (requisicao.n2 == 0){
			resultado = 0;
		} else{
			resultado = requisicao.n1 / requisicao.n2;
		}
		return new CalculadoraResposta(requisicao.n1 , requisicao.n2, resultado);
		
	}
	public CalculadoraResposta Multiplicar(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.n1 * requisicao.n2;
		return new CalculadoraResposta(requisicao.n1 , requisicao.n2, resultado);		
		
	}
	
}
