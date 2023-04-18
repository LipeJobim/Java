package ex2;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.print("Insira o valor 2: ");
		double valor2 = sc.nextDouble();
		System.out.print("Insira o valor 3: ");
		double valor3 = sc.nextDouble();

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.print("o valor mais alto é o  valor 1 e ele vale" + valor1);
		}
		if (valor2 > valor1 && valor2 > valor3) {
			System.out.print("o valor mais alto é o valor 2 e ele vale" + valor2);
		}
		if (valor3 > valor2 && valor3 > valor1) {
			System.out.print("o valor mais alto é o valor 3 e ele vale" + valor3);
		}
	}
	}

