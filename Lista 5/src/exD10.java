package ex5;

import java.util.Scanner;

public class exD10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o número? ");
		int num = sc.nextInt();
		System.out.println(parOuImpar(num));

	}

	public static String parOuImpar(int numero) {
		if (numero % 2 == 0) {
			return "Par";
		} else {
			return "Ímpar";
		}
	}
	}
