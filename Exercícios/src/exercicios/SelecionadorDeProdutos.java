package exercicios;
import java.util.Scanner;
public class SelecionadorDeProdutos {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Digite o código do produto e quantidade desejada.");
		 int codigo = sc.nextInt();
		 int quantidade = sc.nextInt();
		 double valor;
		 
		 if (codigo == 1) {
			 valor = 4.00 * quantidade;
			 System.out.println("Pediu " + quantidade + " Cachorros quentes, o valor foi de " + valor);	 
		 }
		 else if (codigo == 2){
			 valor = 4.50 * quantidade;
			 System.out.println("Pediu " + quantidade + " X-salada, o valor final foi de " + valor);
		 } 
		 else if (codigo == 3){
			 valor = 5 * quantidade;
			 System.out.println("Pediu " + quantidade + " X-bacon, o valor final foi de " + valor);
		 }
		 else if (codigo == 4){
			 valor = 2 * quantidade;
			 System.out.println("Pediu " + quantidade + " torrada simples, o valor final foi de " + valor);
		 }
		 else if (codigo == 5){
			 valor = 1.50 * quantidade;
			 System.out.println("Pediu " + quantidade + " refrigerante, o valor final foi de " + valor);
		 }
		 else 
			 System.out.println("Código incorreto.");
		 
		 
		 sc.close();
	 }

}
