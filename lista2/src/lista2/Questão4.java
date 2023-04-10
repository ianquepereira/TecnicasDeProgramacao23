package lista2;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		int valor1 = 1, resultado = 0;
		
		System.out.println("Digite um numero:");
		Scanner entrada= new Scanner(System.in);
		int valor2 = entrada.nextInt();
		System.out.println("Tabuada de Multiplicação:");
		
		while(valor1 <= 10) {
			resultado = valor1 * valor2;
			System.out.println(valor1+" x "+valor2+" = "+resultado );
					valor1++;
		}
	}

}
