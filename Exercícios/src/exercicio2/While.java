package exercicio2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O que irá abastecer: 1 - Alcool | 2 - Gasolina | 3  - Dissel | 4  - fim");
		
		int opcao = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int dissel = 0;
		
		while (opcao != 4) {
			
			if (opcao == 1) {
				System.out.println("Abasteceu alcool");
				alcool += 1;
			}
			else if (opcao == 2) {
				System.out.println("Abasteceu gasolina");
				gasolina += 1;
			}
			else if (opcao == 3) {
				System.out.println("Abasteceu dissel");	
				dissel += 1;
			}
			else {
				System.out.println("Opção invalida. selecione denovo");
			}
			System.out.println("O que irá abastecer: 1 - Alcool | 2 - Gasolina | 3  - Dissel | 4  - fim");
			opcao = sc.nextInt();
		}
		System.out.println("Fim do programa " + " Gasolina = " +gasolina + " Alcool = " +alcool + " Dissel = " +dissel );
		sc.close();
	}
}
