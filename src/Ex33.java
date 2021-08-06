package ExerciciosAula17;

import java.util.Scanner;

import com.sun.jdi.IntegerValue;

/*O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.*/

public class Ex33 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de temperaturas:");
		int qtd = scan.nextInt();

		double temperaturaMaior = Integer.MIN_VALUE;
		double temperaturaMenor = Integer.MAX_VALUE;
		double totalTemperatura = 0;
		double mediaTemperatura = 0;

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite a temperatura");
			double temperatura = scan.nextDouble();

			totalTemperatura = temperatura + totalTemperatura;
			mediaTemperatura = totalTemperatura / qtd;

			if (temperatura < temperaturaMenor) {
				temperaturaMenor = temperatura;

			}
			if (temperatura > temperaturaMaior) {
				temperaturaMaior = temperatura;

			}

		}
		System.out.println("Menor " + temperaturaMenor);
		System.out.println("media " + mediaTemperatura);
		System.out.println("maior " + temperaturaMaior);
	}

}
