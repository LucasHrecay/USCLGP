package ATV;

import java.util.Scanner;

public class Atv06 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		int num2 = 50;
        int contador = 1;
        int num;
        
        System.out.println("Digite um número entre 1 e 100:");
        num = scanner.nextInt();

        do {
            if (num == num2) {
                System.out.println("Voce acertou o numero");
                continue;
            } else if (num > num2) {
                System.out.println("Esse número é maior");
            } else  {
                System.out.println("Esse numero é menor");
                         
            }
            System.out.println("Digite um número entre 1 e 100:");
            num = scanner.nextInt();
            contador++;
        } while (num != num2);

        scanner.close();
}
}
