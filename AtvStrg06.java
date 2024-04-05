package ATV05STRG;

import java.util.Scanner;

public class ATV06STRG {

public static void main (String[]args) {

Scanner scanner = new Scanner (System.in);

String primeira ="";

String segunda ="";

String terceira ="";

System.out.println("Digite a primeira palavra");

primeira = scanner.nextLine();

System.out.println("Digite a segunda");

segunda = scanner.nextLine();

System.out.println("Digite a terceira");

terceira = scanner.nextLine();

int pri = primeira.length();

int seg = segunda.length();

int ter = terceira.length();

if(pri>seg && pri > ter) {

System.out.print("A maior palavra é: " + primeira);

}

else if(seg > ter && seg >pri) {

System.out.print("A maior palavra é: " + segunda);

}

else if (ter > pri & ter > seg){

System.out.print("A maior palavra é: " + terceira);

}

}

}
