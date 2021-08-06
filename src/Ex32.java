package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
Fatorial de: 5
5! = 5 . 4 . 3 . 2 . 1 = 120*/

public class Ex32 {
	public static void main(String[]  args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		int num = scan.nextInt();
		int fatorial = 1;
		
		 System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");
		for (int i = num;i > 1; i--) {
			 fatorial = fatorial * i;
			
			
			 System.out.print(i + " . ");
			
		}
		
		System.out.println(" 1 = " + fatorial);
		
		
		
		
	}

}
