package ex2;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.print("Insira o valor 2: ");
		double valor2 = sc.nextDouble();
		System.out.print("Insira o valor 3: ");
		double valor3 = sc.nextDouble();

		if (valor2 > valor1 && valor1 < valor3) {
			System.out.print(valor2 + valor3);
		} else if (valor1 > valor2 && valor2 < valor3) {
			System.out.print(valor1 + valor3);
		} else {
			System.out.print(valor1 + valor2);
		}

	}
	}

