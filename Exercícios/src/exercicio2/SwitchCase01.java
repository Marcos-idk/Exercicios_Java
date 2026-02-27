package exercicio2;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Usando numeros de 1 a 7, em que dia da semana você está?");

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		System.out.println("O dia da semana onde você está é:" + dia);
		sc.close();

	}

}
