package ex1;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gasolina = 4.5;
		System.out.print("quilometragem inicial: ");
		double qinicial = sc.nextDouble();
		System.out.print("quilometragem final: ");
		double qfinal = sc.nextDouble();
		System.out.print("litros gastos: ");
		double lgastos = sc.nextDouble();
		System.out.print("valor recebido por viagem: ");
		double vrecebido = sc.nextDouble();
		
		double km = qfinal / qinicial;
		double kml = km / lgastos;
		double totalCombustivel = lgastos * gasolina;
		double lucro = vrecebido - totalCombustivel;

		System.out.print("Média de Consuma (km/l):  " + (kml) + "\n");
		System.out.print("Luro do dia: " + (lucro));
		

	}

	}

