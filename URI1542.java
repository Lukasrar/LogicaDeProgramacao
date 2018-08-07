import java.util.Scanner;

public class URI1542 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantPag = 1;
		int numeroDias = 1;
		int numeroP = 1;
		int total = 1;
		do {
			quantPag = sc.nextInt();
			numeroDias = sc.nextInt();
			numeroP = sc.nextInt();
			total = ((numeroP*quantPag)*(-numeroDias))/(quantPag-numeroP);
			if (quantPag == 1) {
				System.out.println("1 pagina");
			} else {
				System.out.println(total + " paginas");
			}

		} while (quantPag > 0);

	}
}
