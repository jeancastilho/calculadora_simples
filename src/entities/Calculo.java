package entities;

public class Calculo {

	
	private double valor1;
	private double valor2;
	
	public Calculo(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Calculo() {
		// TODO Auto-generated constructor stub
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	
	public double soma(double valor1, double valor2) {
		
		return valor1 + valor2;
	}
	
	public double subtracao(double valor1, double valor2) {
		
		return valor1 - valor2;
	}
	
	public double divisao(double valor1, double valor2) {
		
		return valor1 / valor2;
	}
	
	public double multiplicacao (double valor1, double valor2) {
		
		return valor1 * valor2;
	}
	
	
	
}
