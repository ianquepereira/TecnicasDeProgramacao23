package lista1;

public class Questão11 {

	public static void main(String[] args) {
		int a = 10, b = 10;
		
		if(!(a > 10)){
			if(a + b == 20){
				System.out.println("A + B == 20");
			}
		}
		if(!(a > 10) && !(a + b == 20)){
			System.out.println("número não válido");
		}

	}

}
