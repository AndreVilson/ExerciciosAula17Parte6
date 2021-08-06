package ExerciciosAula17;

import java.util.Scanner;

/*O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00*/

public class Ex31 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double preco = 0;
		double precoTotal = 0;
		double dinheiro = 0;
		double troco = 0;

		boolean continuar = true;

		while (continuar == true) {

			System.out.println("Lojas Tabajara");

			for (int i = 1; i > 0; i++) {

				System.out.print("Produto " + i + ": " + "R$ ");
				preco = scan.nextDouble();
				precoTotal = preco + precoTotal;
				if (preco == 0) {
					i = 0;

					System.out.println("Total em compras: " + precoTotal);
					boolean dinheiroValido = false;
					while (dinheiroValido == false) {
						System.out.print("Dinheiro: R$ ");
						dinheiro = scan.nextDouble();

						if (dinheiro > precoTotal) {
							troco = dinheiro - precoTotal;
							System.out.println("Troco: R$ " + troco);
							System.out.println("**********************");
							System.out.println("Lojas Tabajara");
							dinheiroValido = true;
						} else {
							System.out.println("Dinheiro insuficiente");
						}

					}

				}

			}

		}
	}

}
