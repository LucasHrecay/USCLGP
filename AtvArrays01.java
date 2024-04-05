 package ATV;

import java.util.Scanner;

public class AtvArray01 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
				
		int [] a = {15,25,35,45,55};
		int soma = 0;
		
		for(int i = 0; i <a.length; i++ ) {
			soma += a[i];
		}
			System.out.println("A soma dos valores do Array é: " + soma);
		
}
}
