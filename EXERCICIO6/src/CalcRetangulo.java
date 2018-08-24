import java.util.Scanner;

public class CalcRetangulo {

	double base, altura, areaRetangulo,perimetro;

	Scanner entrada = new Scanner(System.in);

	public void CalcularRetangulo(double base,double altura) {

		
		 	System.out.println("Informe o valor da base do retangulo ou lado");
    		base = entrada.nextDouble();
    		System.out.println("Informe o valor da altura do retangulo ou lado");
			altura = entrada.nextDouble();
    		if (base > 0|| altura>0) {
    		this.areaRetangulo = base * altura;	
    		this.perimetro = (base+altura)*2;
			System.out.println("A area de um retangulo de base = " + base);
			System.out.println("e altura " + altura);
			System.out.println("é igual a: " + areaRetangulo);
			System.out.println("com perimetro de: " + perimetro);
			
			
		} else {
			System.out.println("Favor digitar um numero maior que zero.");
		}
		
	}
	
	

	public static void main(String[] args) {

						
		CalcRetangulo retangulo = new CalcRetangulo();		
		retangulo.CalcularRetangulo(0,0);
	}

}
