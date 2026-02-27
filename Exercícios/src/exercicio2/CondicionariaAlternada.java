package exercicio2;

import java.util.Scanner;

public class CondicionariaAlternada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome.");
		String nome = sc.next();

		String saldacao = nome.equals("Joao") ? "Ola joao" : "Bem vindo new user";
		System.out.println(saldacao);

		sc.close();
	}

}
