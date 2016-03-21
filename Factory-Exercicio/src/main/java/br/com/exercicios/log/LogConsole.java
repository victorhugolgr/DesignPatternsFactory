package br.com.exercicios.log;

public class LogConsole extends Log{

	@Override
	protected ImprimeLog geraLog(String mensagem) {
		return new ImprimeLogConsole();
	}

	
}
