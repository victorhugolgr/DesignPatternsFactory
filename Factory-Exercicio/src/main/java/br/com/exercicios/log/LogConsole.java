package br.com.exercicios.log;

public class LogConsole extends Log{

	@Override
	protected ImprimeLog geraLog() {
		return new ImprimeLogConsole();
	}



	
}
