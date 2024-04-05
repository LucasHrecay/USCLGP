package ATV;

import java.util.Scanner;

public class ATVSTR03 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		String nome = "";
		
		int nota1;
		int nota2;
		int notaBimestre;
		
		System.out.println("Digite o nome do aluno");
			nome = scanner.nextLine();	
			
			System.out.println("Digite a primeira nota");
			nota1 = scanner.nextInt();
			System.out.println("Digite a segunda nota");
			nota2 = scanner.nextInt();
			
			System.out.println(notaBimestre = (nota1 + nota2)/2);
		}
}
