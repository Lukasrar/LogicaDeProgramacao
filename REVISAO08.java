import java.util.Scanner;

public class REVISAO08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada  = sc.nextInt();
		double total = 0;
		while (entrada > 0) {
			entrada--;
			sc.nextLine();
			while (entrada > 0) {
				entrada--;
			
			double preco = sc.nextDouble();
			if (preco < 1000) {
				total = preco+preco;
			}
			System.out.println(total);
			
		}
	}

	}
}
