package ex5;

import java.util.Scanner;

public class exD6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas maças foram compradas? ");
		int macas = sc.nextInt();
		float total = macas * precoMaca(macas);
		System.out.println(total);
	}

	public static float precoMaca(int qtde) {
		if (qtde < 12) {
			return 0.30f;
		} else {
			return 0.25f;
		}
	}
	}

