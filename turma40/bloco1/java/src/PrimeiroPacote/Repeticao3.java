package PrimeiroPacote;

import java.util.Scanner;

public class Repeticao3 {
	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a sua idade: ");
		idade = scan.nextInt();

		do {
			System.out.print("\nSua idade �: " + idade+" anos");
			if (idade >= 18) {
				System.out.print("\nVoce � de maior");
			} else {
				System.out.print("\nVoce � de menor");
			}
			System.out.print("\nEntre com a sua idade: ");
			idade = scan.nextInt();
		} while (idade >= 1);
	}
}
