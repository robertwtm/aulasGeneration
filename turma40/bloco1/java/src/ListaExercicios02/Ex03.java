//3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra: 10-14 infantil / 15-17 juvenil / 18-25 adulto

package ListaExercicios02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int idade;

		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.print("Sua categoria � Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.print("Sua categoria � Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.print("Sua categoria � Adulto");
		} else {
			System.out.println("Sua idade n�o tem categoria adequada, desculpe.");
		}
	}
}
