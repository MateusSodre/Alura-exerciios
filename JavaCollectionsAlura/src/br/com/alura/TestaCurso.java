package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalando com ArrayLists" , 21));//
		javaColecoes.adiciona(new Aula("Trabalando com ArrayLists" , 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula" , 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções" , 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}
}
