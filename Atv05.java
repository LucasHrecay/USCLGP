package ATV;
import java.util.Scanner;
public class Atv05 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
	System.out.println("Digite o numero de um mês");
	int mes = scanner.nextInt();
	
	switch(mes) {
	case 1: {
		System.out.println("Jan");
		break;
	}
	case 2: {
		System.out.println("Fev");
		break;
	}
	case 3: {
		System.out.println("Mar");
		break;
	}
	case 4: {
		System.out.println("Abr");
		break;
	}
	case 5: {
		System.out.println("Mai");
		break;
	}
	case 6: {
		System.out.println("Jun");
		break;
	}
	case 7: {
		System.out.println("Jul");
		break;
	}
	case 8: {
		System.out.println("Ago");
		break;
	}
	case 9: {
		System.out.println("Set");
		break;
	}
	case 10: {
		System.out.println("Out");
		break;
	}
	case 11: {
		System.out.println("Nov");
		break;
	}
	case 12: {
		System.out.println("Dez");
		break;
	}
	
	}
	
	if (mes >12) {
		System.out.println("Digite um numero entre 1 e 12");
	}
	else {
		System.out.println("Digite um numero maior que zero e no maximo 12");
	}
	}
}
