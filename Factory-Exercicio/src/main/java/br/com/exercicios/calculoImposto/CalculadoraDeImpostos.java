package br.com.exercicios.calculoImposto;

abstract class CalculadoraDeImpostos {

	private double valor;


	public CalculadoraDeImpostos(double valor) {
		super();
		this.valor = valor;
	}

	abstract void log(String message);

	protected void calcular() {
		double valorCalculado = this.valor * 0.07;
		log("Imposto calculado para valor R$ " + this.valor + " é: " + valorCalculado);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


}
