package ex2;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a coordenada x: ");
		double x = sc.nextDouble();
		System.out.print("Insira a coordenada y: ");
		double y = sc.nextDouble();

		if (x == 0 || y == 0) {
			System.out.print("as coordenadas não podem conter um valor ZERO!");
		}

		if (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.print("você esta no primeiro quadrante");

			} else if (x < 0 && y > 0) {
				System.out.print("você esta no segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.print("você esta no terceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.print("você esta no quarto quadrante");

			}
		} else {
			System.out.print("não esta em nehum quadrante!");

		}

	}

}
