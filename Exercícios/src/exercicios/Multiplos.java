package exercicios;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite abaixo os dois valores um ao lado do outro apenas com espaço os separando");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0 )
			System.out.println("Multiplos");
		else 
			System.out.println("Não são multiplos");
		
		sc.close();
		

	}

}
