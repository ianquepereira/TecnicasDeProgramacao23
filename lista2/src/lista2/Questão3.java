package lista2;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		
		int valor = 95, numero;
		
		do {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero entre 1 e 100:");
			numero = entrada.nextInt();
			
			if (numero < valor){
				System.out.println("Numero menor que o valor!");
			}
			if(numero > valor){
				System.out.println("Numero maior que o valor!");
			}
			if (numero == valor) {
				System.out.println("Você acertou!");
			}
		}while(numero != valor);
}
}