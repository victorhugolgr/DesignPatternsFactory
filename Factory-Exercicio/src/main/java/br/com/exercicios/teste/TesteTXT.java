package br.com.exercicios.teste;

import br.com.exercicios.log.Log;
import br.com.exercicios.log.implementacao.LogTxt;

public class TesteTXT {
	public static void main(String[] args) {
		Log log = new LogTxt();
		log.log("Log pelo arquivo TXT 2");
	}
}
