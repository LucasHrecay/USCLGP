package ATV;

import java.util.Scanner;
//Aqui temos a comparação entre duas Strings
//Temos tambem UpperCase para colocar em letra maiuscula
//e ignorando se é digitado com leta minuscula ou maiuscula

public class ATVSTR02 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		String cidade = "";
		
		System.out.println("Digite o nome de uma cidade");
			cidade = scanner.nextLine();	
			
		if (cidade.equalsIgnoreCase ("Curitiba")) {
			System.out.println("Voce digitou o nome da melhor cidade " + cidade.toUpperCase() +"!!!" );
			
		}
		else {
			System.out.println("Errou");
		}
		
		}
		
}
	

