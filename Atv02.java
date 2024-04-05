package ATV;
import java.util.Scanner;

public class Atv02 {
	public static void main (String[]args) {
		//Esse programa diz se o numero digitado é par ou impar
	Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		
	int num = scanner.nextInt();
			
	if(num%2 ==0) {
		System.out.println("O numero " + num + " é par");	
	}
	else {
		System.out.println("Este numero é impar");
	}
	
}
}
