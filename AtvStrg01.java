package ATV;	
 
 //Teste de nome - onde só aparesenta o primeiro nome
// Tambem apresenta o nome em letras maiusculas

public class ATVSTR01 {
	public static void main (String[]arg) {
		
		String nome = "Lucas Adriano Hrecay";
		String [] partes = nome.split(" ");
		
		if (partes.length >0) {
			System.out.println(partes[0]);
			System.out.println(nome.toUpperCase());
		}
		else {
			System.out.println("Não foi possivel encontrar o primeiro nome");
			
		}
		
	}
}
