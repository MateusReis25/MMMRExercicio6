package br.com.rd;

public class Calculo {

	private int valor1; 
	private int valor2; 
	
	Calculo(int v1, int v2){
		this.valor1 = v1;
		this.valor2 = v2;
	}
		
	public int somar() {
		return this.valor1 + this.valor2;
	}
	
	public int subtrair() {
		return this.valor1 - this.valor2;
	}
	
	public int multiplicar() {
		return this.valor1 * this.valor2;
	}
	
	public int dividir() {
		return this.valor1 / this.valor2;
	}
}
