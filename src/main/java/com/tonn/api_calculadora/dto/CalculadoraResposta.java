package com.tonn.api_calculadora.dto;

public class CalculadoraResposta {
	
	private double v1;
	private double v2;
	private double resultado;
	
	public CalculadoraResposta(double v1, double v2, double resultado) {
		this.v1 = v1;
		this.v2 = v2;
		this.resultado = resultado;
	}

	public double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}
