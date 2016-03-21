package br.com.exercicios.log.implementacao;

import br.com.exercicios.log.ImprimeLog;

public class ImprimeLogConsole implements ImprimeLog{

	@Override
	public void imprime(String mensagem) {
		
		System.out.println(mensagem);
		
	}

	
}
