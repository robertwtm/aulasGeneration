// 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
package ListaExercicios02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um numero: ");
		numero = scan.nextDouble();
		
		if (numero%2 == 0) {
			System.out.println("O numero digitado � Par: " +numero);
			System.out.println("Raiz quadrada: " +Math.sqrt(numero)); 
		} else {
			System.out.println("Numero Impar!");
			
		}
		
		
	}
}
