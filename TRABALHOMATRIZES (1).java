import java.util.Locale;
import java.util.Scanner;

public class TRABALHOMATRIZES {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a quantidade de casos");
		int n = sc.nextInt();
		String nome[] = new String[n];
		String telefone[] = new String[n];
		int tipo[] = new int [n];
		int minutos[] = new int [n];
		int tipo1 = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.println("Telefone: ");
			telefone[i] = sc.next();
			
			System.out.println("Tipo: ");
			tipo[i] = sc.nextInt();
			
			if (tipo[i]==1) {
				tipo1++;
			}
			
			System.out.println("Minutos: ");
			minutos[i] = sc.nextInt();
				
		}
		
		double tabela[][] = new double[3][2];
		System.out.println("Insira o valor de cada tipo e o excedido: ");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				tabela[i][j] = sc.nextDouble();
			}
		}
		double valor[] = new double[n];
		
		for (int i = 0; i < n; i++) {
		  if (minutos[i] <= 90) {
			valor[i] = tabela[tipo[i]][0];
		  	}
		  else {
			valor[i] = tabela [tipo[i]][0] + (minutos[i]- 90) * tabela [tipo[i]][1];
			}
		}
		
		System.out.print("    Nome");
		System.out.print("            Telefone");
		System.out.print("     Tipo");
		System.out.print("     Pulsos");
		System.out.print("     Valor da conta");
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(nome[i]+"      ");
			System.out.print(telefone[i]+"      ");
			System.out.print(tipo[i]+"        ");
			System.out.print(minutos[i]+"            ");
			System.out.printf("%.2f%n",valor[i]);
			System.out.println();
		}
		
		int opcao = 0;
		double total = 0;
		double contaMaisBarata = 999999;
		
		do {
			System.out.println("Favor digite o numero correspondente da ação desejada");
			System.out.println("1) A receita total da empresa telefônica (soma de todas as contas).");
			System.out.println("2) Nome e telefone do cliente do qual a conta foi mais barata (supor não haver empates).");
			System.out.println("3) Média de pulsos consumidos por clientes de conta tipo 1.");
			System.out.println("4) Nomes e telefones dos clientes que não consumiram pulsos excedentes.");
			System.out.println("5) A quantidade de clientes que consumiu acima de 120 pulsos");
			System.out.println("6) A porcentagem de clientes que possuem conta tipo 2, em relação ao total de clientes.");
			System.out.println("7) Sair");
			System.out.println();
			opcao = sc.nextInt();		
			if (opcao == 1) {
				for(int i = 0; i<n; i++) {
				total +=valor[i];
				}
					System.out.print("A receita total da empresa telefônica é = R$");
					System.out.printf("%.2f%n",total);
					System.out.println();
					
			}
			
			if (opcao == 2) {
				int nomei = 0;
				int telefonei = 0;
				for(int i = 0; i<n; i++) {
					if (valor[i]<contaMaisBarata) {	
						nomei = i;
						telefonei = i;
					}
				}
				System.out.println("Nome e telefone da conta mais barata: "+nome[nomei]+" "+telefone[telefonei]+" ");
				System.out.println();
			}
			
			if (opcao == 3) {
				int totalTipo1 = 0;
				int clientesTipo1 = 0;
				double mediaTipo1 = 0;
				for(int i=0; i<n; i++) {
					
					if (tipo[i] == 1) {
						totalTipo1 +=minutos[i];
						clientesTipo1++;
					}
				}
				mediaTipo1 = totalTipo1/clientesTipo1;
				System.out.printf("Media de minutos consumidos pelos clientes tipo 1 = %.1f%n",mediaTipo1);
				System.out.println();
			}
	
			if (opcao == 4) {
				int nomeNaoExcedente = 0;
				int telefoneNaoExcedente = 0;
				System.out.println("Nomes e telefones dos clientes que não consumiram pulsos excedentes: ");
				for(int i = 0; i<n; i++) {
					if (minutos[i]<=90) {	
						nomeNaoExcedente = i;
					    	telefoneNaoExcedente = i;
						    	System.out.println(nome[nomeNaoExcedente]+" "+telefone[telefoneNaoExcedente]+" ");
						    	System.out.println();
					}  
			    }
			}
			
			if (opcao == 5) {
				int quantClientesAcimaDe120 = 0;
				System.out.print("Quantidade de clientes que consumiu acima de 120 pulsos: ");
				for(int i = 0; i<n; i++) {
					if (minutos[i]>120) {	
						quantClientesAcimaDe120++;
					}  
			   }
		    	System.out.println(quantClientesAcimaDe120);
		    	System.out.println();
			}
			
			if (opcao == 6) {
				int totalClientes = n;
				int clientesTipo2 = 0;
				double porcentagem = 0;
					for(int i=0; i<n; i++) {
					if (tipo[i] == 2) {
						clientesTipo2++;
					}
				}
				porcentagem = ((clientesTipo2*100)/totalClientes);
				System.out.printf("A porcentagem de clientes que possuem conta tipo 2, em relação ao total de clientes e = %.1f",porcentagem);
				System.out.println("%");
				System.out.println();
				
			}
			if (opcao == 7) {
				System.out.println("Saindo...");
				System.out.println();
				sc.close();
			}
			
		} while(opcao != 7);
    }
}
