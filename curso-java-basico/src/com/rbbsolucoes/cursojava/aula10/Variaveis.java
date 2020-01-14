package com.rbbsolucoes.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		int idade = 35;
		String nome = "Rafael";
		String nomeGato = "Bob";
		int idadeBob = 2;
		
		int resultado;
		
		resultado = idade - idadeBob;
		
		System.out.println("Usuário " + nome + " de " + idade + " anos tem um gato chamado " + nomeGato);
		
		System.out.println("A diferença de idade entre o usuário " + nome + " e seu gato chamado " + nomeGato + " é de " + resultado);

	}

}
