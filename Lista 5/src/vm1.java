package ex5;
import java.util.Scanner;
public class vm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numero = new int[5];
		 System.out.println("Digite um número ");
		for (int i = 0; i < numero.length; i++) { 
		     System.out.print("- ");
		numero[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
		
		System.out.println(numero[i]);	
	    }
	}
		

	}


