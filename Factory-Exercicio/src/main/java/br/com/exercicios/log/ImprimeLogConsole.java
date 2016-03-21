package br.com.exercicios.log;

public class ImprimeLogConsole implements ImprimeLog{

	@Override
	public void imprime(String mensagem) {
		
		System.out.println(mensagem);
		
	}

	
}
