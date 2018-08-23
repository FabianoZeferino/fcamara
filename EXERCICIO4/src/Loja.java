import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
		
		double area, precolt,precott,latas;
		
		precolt=80;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da area em metros quadrados. \n");
        area = entrada.nextInt();
        
        latas = (area/3)/18;
        latas = Math.ceil(latas);
        
        precott= latas*precolt;
        
        
        
        System.out.println("Você precisará de "+latas+" latas"+" e o custo total é de "+" R$"+ precott );
        
     
		

	}

}
