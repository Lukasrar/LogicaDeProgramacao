import java.util.Scanner;

public class REVISAO07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double primeiroPreco = 0;
        double segundoPreco = 0;
        do {
        	 primeiroPreco = sc.nextDouble();
             segundoPreco = sc.nextDouble();
        	if (primeiroPreco > segundoPreco) {
        		System.out.println("Segundo");
        	}else if (primeiroPreco < segundoPreco) {
        		System.out.println("Primeiro");
        	}else if (primeiroPreco == segundoPreco) {
        		System.out.println("Precos iguais");
        	}else if (primeiroPreco == 0 || segundoPreco == 0) {}
        }while(primeiroPreco != 0 || segundoPreco != 0);
	}

}
