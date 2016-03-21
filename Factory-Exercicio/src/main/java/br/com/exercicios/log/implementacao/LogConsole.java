package br.com.exercicios.log.implementacao;

import br.com.exercicios.log.ImprimeLog;
import br.com.exercicios.log.Log;

public class LogConsole extends Log{

	@Override
	protected ImprimeLog geraLog() {
		return new ImprimeLogConsole();
	}



	
}
