/*******************************************************************************
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
*******************************************************************************/

package ListaExercicios01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		double custoF,preco;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o custo de f�brica do veiculo: ");
        custoF = scan.nextFloat();


        preco = (double) Math.pow(custoF * 28 / 100 + custoF, 2);
        
        System.out.println("O pre�o do veiculo �: " +preco);
	}

}
