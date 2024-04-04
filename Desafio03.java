package Aula3;
import java.util.Scanner;

public class Desafio03 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		//declarando a nota
		System.out.println("Digite a nota: ");
		int nota = scanner.nextInt();
		
		if(nota >= 70 && nota <=89) {
			System.out.println("Aluno Aprovado");
		}
	
	else if(nota >=90) {
	System.out.println("Aluno aprovado"  + " Parabéns!!!");
}
	
		
	else {
			System.out.println("Reprovado");
		}
}
}
