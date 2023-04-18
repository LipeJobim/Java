package ex2;
import java.util.Arrays;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long[] valor = new long[3];
		System.out.print("Insira o valor 1: ");
		valor[0] = sc.nextLong();
		System.out.print("Insira o valor 2: ");
		valor[1] = sc.nextLong();
		System.out.print("Insira o valor 3: ");
		valor[2] = sc.nextLong();

		if (valor[0] == valor[1] || valor[0] == valor[2] || valor[1] == valor[2]) {
			System.out.print("valor não pode ser repetido");
		} else {
			boolean flag;

			do {

				flag = false;

				for (int i = 0; i < valor.length - 1; i++) {
					if (valor[i] > valor[i + 1]) {
						long aux = valor[i];

						valor[i] = valor[i + 1];
						valor[i + 1] = aux;

						flag = true;
					}
				}

			} while (flag);

			System.out.print("Os números digitados na ordem crescente são: " + Arrays.toString(valor));

		}

	}

}
