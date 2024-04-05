package ATV;
import java.util.Scanner;

public class Atv03 {
	public static void main (String[]args) {
		// Esse programa diz o dia da semana
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 7");
			int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		
			
		}
			
			
	}		
}
