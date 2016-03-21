package br.com.exercicios.log.implementacao;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import br.com.exercicios.log.ImprimeLog;

public class ImprimeLogTxt implements ImprimeLog{

	@Override
	public void imprime(String mensagem) {
		System.out.println("Inicio");
		try {
			List<String> lines = Files.readAllLines(Paths.get("D:\\Log_Java_Teste.txt"));
			lines.add(mensagem);
			Files.write(Paths.get("D:\\Log_Java_Teste.txt"),lines);
			System.out.println("Finalizado!");
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

}
