/*******************************************************************************
*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*******************************************************************************/
package ListaExercicios01;

import java.util.Scanner;

public class Ex03 {
	
		public static void main(String[] args) {
		
		int segundos;
		float horas, minutos;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tempo de dura��o de um evento da f�brica expressa em segundos: ");
		segundos = scan.nextInt();
		
		horas = (segundos/3600);
		minutos = ((segundos%3600)/60);
		segundos = ((segundos%3600)%60);
		
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.print("Segundos: " + segundos);
	}
}
