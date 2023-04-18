package ex5;
import java.util.Arrays;
public class vm8 {

	public static void main(String[] args) {
		    int[] vetor1 = {1, 2, 3, 4, 5};
		    int[] vetor2 = {6, 7, 8, 9, 10};
		    
		    int[] produto = vetores(vetor1, vetor2);
		    exibir(produto);
		  }
		  public static int[] vetores(int[] vetor1, int[] vetor2) {
		    int[] produto = new int[vetor1.length];
		    for (int i = 0; i < vetor1.length; i++) {
		      produto[i] = vetor1[i] * vetor2[i];
		    }
		    return produto;
		  }
		  
		  public static void exibir(int[] vetor) {
		    System.out.println(Arrays.toString(vetor));
		  }
	}


