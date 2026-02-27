package exercicios;

import java.util.Scanner;

public class EntreValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor entre 1 e 100: ");
		double num = sc.nextDouble();

		if (num >= 0 && num <= 25) {
			System.out.println("O número escolhido está entre 0 e 25");
		} else if (num > 25 && num <= 50) {
			System.out.println("O número está entre 26 e 50");
		} else if (num >= 51 && num <= 75) {
			System.out.println("O número está entre 51 e 75");
		} else if (num >= 76 && num <= 100)
			System.out.println("O número está entre 76 e 100");
		else
			System.out.println("Valor fora dos parametros de 1 a 100.");

		sc.close();
	}
}