package ex5;

import java.util.Scanner;

public class exD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Número? ");
		int numero = sc.nextInt();
		if (negativo(numero)) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
	}

	public static boolean negativo(int num) {
		return num < 0;
	}

	}

