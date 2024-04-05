package ATV;
import java.util.Scanner;  

public class Atv01 {
	public static void main (String[]args) {
	
	//Esse sitema diz se o numero é positivo, negativo ou zero
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um numero: " );
		int num = scanner.nextInt();
		
		if(num> 0) {
			System.out.println("Este numero é positivo " + num);
			
		}
		else if(num ==0) {
			System.out.println("Este numero é zero: ");
			
		}
		else{
		System.out.println("Este numero é negativo");
		
	}
}
}
