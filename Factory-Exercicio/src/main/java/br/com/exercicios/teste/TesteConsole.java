package br.com.exercicios.teste;

import br.com.exercicios.log.Log;
import br.com.exercicios.log.LogConsole;

public class TesteConsole {

	public static void main(String[] args) {
		Log log = new LogConsole();
		log.log("Primeira Mensagem para teste.");
	}

}
