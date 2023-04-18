package ex5;
import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos? ");
		int n = sc.nextInt();

		System.out.print("Primeiro elemento? ");
		int a1 = sc.nextInt();

		System.out.print("Razão da progressão? ");
		int r = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\n", i + 1, progressao(a1, i, r));
		}

		sc.close();
	}

	public static int progressao(int primeiro, int elemento, int razao) {
		return primeiro + elemento * razao;
		}
		
	}


