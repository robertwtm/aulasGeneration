package PacoteJava;

import java.util.Scanner;

public class condicional1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		String nome;

		System.out.println("Entre com a sua idade: ");
		idade = scan.nextInt();
		scan.nextLine();
		System.out.println("Entre com o seu nome");
		nome = scan.nextLine();

		System.out.println(" Seu nome �: " + nome);
		System.out.println(" Sua idade �: " + idade);

		if (idade >= 18) {
			System.out.println("Voce � maior de idade!! ");
		} else if (idade>=1 && idade<18){
			System.out.println("Voce � menor de idade");	
		}else {
			System.out.println("Voce � o que ?");
		}
	}
}
