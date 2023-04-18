package ex3;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valores ímpares:");
		for (int i = 100; i < 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

}
