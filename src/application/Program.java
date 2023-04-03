package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 1;
		int fibonacci = 0;
		System.out.println("entre com o numero que deseja validar");
		int valor = sc.nextInt();
		if (valor == 0 ) {
			System.out.println("O valor informado pertence à fibonacci ");
		}
		int aux = 0;
		while(valor > fibonacci) {
			fibonacci = n1 + n2;
			n1 = n2;
			n2 = fibonacci;
			
			if (valor == fibonacci) {
				System.out.println("O valor informado pertence à fibonacci ");
				aux = 1;
			}
			
		}
		if(valor != 0 && aux == 0) {
			System.out.println("O valor informado não pertence à fibonacci ");
		}

	}
}	
