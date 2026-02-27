package exercicios;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número para descobrir se ele é par ou impar: ");
	int num = sc.nextInt();
	
	if (num %2 == 0)
		System.out.println("O número escolhido é par.");
	
	else 
		System.out.println("O número escolhido é impar.");
	sc.close();
	}

}
