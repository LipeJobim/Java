package ex3;

public class ex25 {

	public static void main(String[] args) {
		
		for (int cont = 1000; cont < 2000; cont++) {
            if (cont%11 == 5) {
                System.out.printf("%d dividido por 11 tem resto igual a 5\n", cont);
            }
        }
	}

}
