package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.*/

public class Ex28 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de CD's:");
		int qtdCd = scan.nextInt();
		double valorCd = 0;
		double valorTotal = 0;
		double valorMedio = 0;
		
		for (int i = 1; i <= qtdCd; i++) {
			
			System.out.println("Digite o valor do CD: " + i);
			 valorCd = scan.nextDouble();
			 valorTotal = valorCd + valorTotal;
			 valorMedio = valorTotal / qtdCd;
		
		}
		
		System.out.println("Quantidade de CD's: " + qtdCd);
		System.out.println("valor total investido: " + valorTotal);
		System.out.println("Valor médio: " + valorMedio);
		
	}

}
