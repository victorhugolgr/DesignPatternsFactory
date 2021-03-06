package br.com.exercicios.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Log {

	protected abstract ImprimeLog geraLog();
	
	public void log(String mensagem){
		String dataAtual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		String mensagemComTempo;
		mensagemComTempo = "Data: " + dataAtual + " - " + mensagem;
		geraLog().imprime(mensagemComTempo);
	}
}
