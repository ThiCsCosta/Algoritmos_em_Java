package resolucao;

import java.util.Scanner;

public class NumeroParOuImpar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println("O número digitado é Par!");
		}
		else {
			System.out.println("O número digitado é Ímpar.");
		}
		sc.close();
	}

}
