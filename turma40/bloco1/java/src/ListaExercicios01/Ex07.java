/*******************************************************************************
*7. Um sistema de equa��es lineares do tipo: , pode ser resolvido segundo mostrado abaixo: Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,respectivamente.
*******************************************************************************/

package ListaExercicios01;

import java.util.Scanner;

public class Ex07 {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x,y,a,b,c,d,e,f;
		
        System.out.println("Escreva o valor de A: ");
        a = scan.nextDouble();

        System.out.println("Escreva o valor de B: ");
        b = scan.nextDouble();

        System.out.println("Escreva o valor de C: ");
        c = scan.nextDouble();

        System.out.println("Escreva o valor de D: ");
        d = scan.nextDouble();

        System.out.println("Escreva o valor de E: ");
        e = scan.nextDouble();

        System.out.println("Escreva o valor de F: ");
        f = scan.nextDouble();

        x = ((c*e)- (b*f))/((a*e)-(b*d));
        y = ((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("X = " +x+ "\nY = "+ y);
		
	}
}
