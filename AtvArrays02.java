package ATV;

import java.util.Scanner;

public class AtvArrays02 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		 String[] Alunos = new String[3];
	        double[][] notas = new double[3][2]; 
		
				
		for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            Alunos[i] = scanner.nextLine();

            System.out.println("Digite a nota do aluno " + Alunos[i] + " no 1º bimestre:");
            notas[i][0] = scanner.nextDouble();

            System.out.println("Digite a nota do aluno " + Alunos[i] + " no 2º bimestre:");
            notas[i][1] = scanner.nextDouble();

           
            scanner.nextLine();
        }

   
        System.out.println("A medias dos alunos é:");
        for (int i = 0; i < 3; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println("Aluno: " + Alunos[i] + " - Média: " + media);
        }
		
}
}
