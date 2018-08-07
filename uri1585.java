import java.util.Scanner;

public class uri1585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int total = 0;
		while (entrada > 0) {
			entrada--;
			int primeiroNumero = sc.nextInt();
			int segundoNumero = sc.nextInt();
			total = (primeiroNumero * segundoNumero)/2;
			System.out.println(total+" cm2");
		}
	}

}
