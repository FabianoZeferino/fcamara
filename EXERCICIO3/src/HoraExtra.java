import java.util.Scanner;

public class HoraExtra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	

		double salariomin, salariob ,salariol, horatrab, imposto= 0.30, cadahora;
		
		System.out.print("Digite o valor do salario mínimo. \n");
        salariomin = entrada.nextInt(); 
        
        System.out.print("Digite quantidade de horas trabalhadas. \n");
        horatrab = entrada.nextInt();
        
        cadahora = salariomin*0.10;
        
        salariob = (cadahora * horatrab);
        
        salariol = salariob-(salariob*0.03);
        
        System.out.println("O Salario Líquido a receber é: "+ salariol);
        		
	entrada.close();
	}

}
