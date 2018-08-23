import java.util.Scanner;


public class Conta {

	 
		private int numConta;
		private double saldo;
		String nome;
		
		public int getNumConta() {
			return numConta;
		}
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
	public Conta(String nome, int numConta, double saldo_inicial){
	        this.nome=nome;
	        this.numConta=numConta;
	        this.saldo=saldo_inicial;
	    }
	
	Scanner entrada = new Scanner(System.in);
	
		 public void saque(double valor){
		        if(saldo >= valor){
		            saldo -= valor;
		            System.out.println("Valor do Saque: " + "R$"+valor);
		            System.out.println("Novo saldo: "+ "R$" + saldo + "\n");
		        } else {
		            System.out.println("Saldo insuficiente.");
		        }
		    }
		
		 public void deposito(double valor)
		    {
		        saldo += valor;
		        System.out.println("Foram Depositado: " + "R$"+ valor);
		        System.out.println("Novo saldo: "+ "R$" + saldo + "\n");
		    }
		 
		 public void alterarNome(String nNome)
		    {
		        nome = nNome; 
		        System.out.println("\nNome alterado para: "+ nome);
		        
		    }


		
		 public void iniciar(){
		        int opcao;

		        do{
		            exibeMenu();
		            opcao = entrada.nextInt();
		            escolheOpcao(opcao);
		        }while(opcao!=4);
		    }

		    public void exibeMenu(){

		        System.out.println("\t Escolha a opção desejada");
		        System.out.println("1 - Sacar");
		        System.out.println("2 - Depositar");
		        System.out.println("3 - Alterar Nome");
		        System.out.println("4 - Sair\n");
		        System.out.print("Opção: ");

		    }

		    public void escolheOpcao(int opcao){
		        double valor;
		        String nome;
		        

		        switch( opcao ){
		            case 1: 		            			            	
	                        System.out.print("Quanto deseja sacar: ");
	                        valor = entrada.nextDouble();
	                        saque(valor);	
	                        break;

		            case 2: 
			            	System.out.print("Quanto deseja depositar: ");
		                    valor = entrada.nextDouble();
		                    deposito(valor);
		                    break;
		            case 3:
			            	System.out.print("Digite um novo Nome: ");
			            	String nNome = entrada.nextLine();
		                    nome = entrada.nextLine();
		                    alterarNome(nome);
		                    break;

		            case 4: 
		                    System.out.println("Sistema encerrado.");
		                    break;

		            default:
		                    System.out.println("Opção inválida");
		        }
		   }
		 
		 
public static void main(String[] args) {
	String nome; 
	int numConta;
	double valor;
	
		
	 System.out.println("Cadastrando um novo correntista.");
	     
   Conta conta = new Conta (nome= "Fabiano", numConta=0101, 0) ; 
   
   System.out.print("Correntista cadastrado. "+conta.getNome()+"\n");
   
   conta.iniciar();
   
		
	}

}
