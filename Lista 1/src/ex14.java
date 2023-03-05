package ex1;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int turmaC= 60;
		int turmaD= 20;
		System.out.println("qual o percentual de reprovados da turma C " );
		float reprovadosc = sc.nextFloat();
		System.out.println("Qual o percentual de aprovados da turma D");
        float aprovadosD = sc.nextFloat();
        float totalReprovadosc = turmaC*reprovadosc/100;
        float totalReprovadosd = turmaD -(turmaD*aprovadosD/100);
        float totalreprovados = totalReprovadosc + totalReprovadosd;
        float percreprovados = totalreprovados/ (turmaD + turmaC);
        
        System.out.println("quantidade de reprovados na turma C " + totalReprovadosc);
        System.out.println("quantidade de reprovados na turma D "+ totalReprovadosd);
        System.out.println("O percentual de reprovados é "+ percreprovados);
	}

}
