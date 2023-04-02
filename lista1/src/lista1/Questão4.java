package lista1;

public class Questão4 {

	public static void main(String[] args) {
		int a = 8, b = 8;
		
		if(a > 10 || a+b == 20) {
			System.out.println("Número válido!");
		} else  if(a == b) {
			System.out.println("(A é igual B; A e B são diferentes de 10; A é menor que 10)");
		} else{
			System.out.println("Número não válido");
		}
		
	}

}
