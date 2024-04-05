package ATV05STRG;

import java.util.Scanner;

public class ATV05STRG {

public static void main (String[]args) {

Scanner scanner = new Scanner (System.in);

double n1 =0;

double n2 =0;

String nome ="";

System.out.println("Digite o nome do Aluno");

nome = scanner.nextLine();

System.out.println("Digite a primeira nota");

n1 = scanner.nextDouble();

System.out.println("Digite a segunda nota");

n2 = scanner.nextDouble();

double media = (n1 + n2)/2;

System.out.printf("O aluno " + nome + " tirou a nota final de " + media );

}

}
