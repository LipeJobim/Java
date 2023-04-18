package ex2;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos lados tem esse poligono?");
		int quantidadeLados = sc.nextInt();
		System.out.print("Qual a medida dos lados do poligono? ");
		double medidaLados = sc.nextDouble();

		double perimetroTriangulo = medidaLados * quantidadeLados;
		double areaquadrado = Math.pow(medidaLados, 2);

		if (quantidadeLados == 3 || quantidadeLados == 4 || quantidadeLados == 5) {
			if (quantidadeLados == 3) {
				System.out.println("O triângulo em um perimetro de" + (perimetroTriangulo));
			} else if (quantidadeLados == 4) {
				System.out.println("O quadrado tem uma área de" + (areaquadrado));

			} else if (quantidadeLados == 5) {
				System.out.println("É um pentágono");

			} 
		} else {
			System.out.println("Insira um valor de lados entre 3, 4 ou 5!");

		}
	}

}
