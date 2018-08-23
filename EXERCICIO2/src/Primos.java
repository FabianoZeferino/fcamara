import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
		int inicio,fim;
		
		Scanner entrada = new Scanner(System.in);				
		System.out.print("Digite o primeiro número do intervalo, maior que zero. \n");
        inicio = entrada.nextInt(); 
        if (inicio> 0) {
        System.out.print("Digite o segundo número do intervalo, este deve ser maior que o primeiro \n");
        fim = entrada.nextInt(); 
        
        if (fim>inicio) {
       
        	for (int i = inicio; i  < fim; i++) {
        		boolean ehPrimo = true;
        		for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    ehPrimo = false;
                    break;
		                }
		            }
		
		            if (ehPrimo) {
		                System.out.println(i);
		            } 
		         }
		       }
	       else {
	    	   System.out.println("Digite os intervalos na ordem correta!");
	       }
	    }
      else {
     	System.out.println("Digite um numero maior que zero!");
      }
     entrada.close();
  }
	
}
