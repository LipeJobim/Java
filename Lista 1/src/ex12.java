package ex1;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
	

			Scanner sc = new Scanner(System.in);
			System.out.print("Insira o total de eleitores: ");
			float eleitores = sc.nextFloat();
			System.out.print("Insira o total de votos em branco: ");
			float brancos = sc.nextFloat();
			System.out.print("Insira o total de votos nulos: ");
			float nulos = sc.nextFloat();

			System.out.print("% Brancos:  " + (((brancos / eleitores * 100)) + "\n"));
			System.out.print("% Nulos: " + ((nulos / eleitores * 100)));

		}

	}

