package ATV;
	import java.util.Scanner;
public class Desafio03 {
	public static void main (String[]args) {
	Scanner scanner = new Scanner (System.in);
	
	int num1;
	int num2;
	int result;
	String operador ="";
	
	System.out.println("Digite o primeiro numero");
		num1 = scanner.nextInt();
		
	System.out.println("Digite o segundo numero");
		num2 = scanner.nextInt();
		
	System.out.println("Digite a operação (soma , sub, div ou multi)");
		operador = scanner.next();
		
		if(operador.equals("soma")) {
			result = num1 + num2;
			System.out.println(result);
		}
		else if(operador.equals("sub")) {
			result = num1 - num2;
			System.out.println(result);
		}
		else if(operador.equals("div")) {
			result = num1 / num2;
			System.out.println(result);
		}
		else if(operador.equals("multi")) {
			result = num1 * num2;
			System.out.println(result);
		}
		else {
			System.out.println("Digite um operador incorreto");
			
		}
		
}
}
