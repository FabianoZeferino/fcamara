

public class CalculoSalario {

	public static void main(String[] args) {
		
		//variaveis 
		double  salario=1000,
		         ano = 2005, 
		         aumento = 0.15;
		       
		
				        
	        do{
	            salario = salario + (salario * aumento); 	            	
		        aumento = aumento * 2;
		        System.out.println("Ano: "+ ano + " Salario: " + (long)salario); 
		        ano++;
	        }while(ano <= 2018);

	         
	}

}
