import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		double valor = sc.nextDouble();
		double saida = km / valor;
		System.out.printf("%.3f km/l",saida);
		sc.close();
		
	}

}
