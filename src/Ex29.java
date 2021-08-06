package ExerciciosAula17;

import java.util.Scanner;

/*O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
deve pagar ele desenvolveu um tabela que contém o número de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a
atendente do caixa precisa apenas contar quantos itens o cliente está
levando e olhar na tabela de preços. Você foi contratado para
desenvolver o programa que monta esta tabela de preços, que conterá
os preços de 1 até 50 produtos:*/

public class Ex29 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Loja Quase Dois - Tabela de preços");
		
		System.out.println("Digite o valor do produto:");
		double valor = scan.nextDouble();
		System.out.println("Digite a quantidade de produtos:");
		int produtos = scan.nextInt();
		double valorTotal = 0;
		
		for (int i = 1; i <= produtos; i++) {
			
			valorTotal = valor + valorTotal;
			System.out.println("Valor total com " + i + " produtos: " + valorTotal);
			
			
			
		}
		
		
		
		
		
		
	}

}
