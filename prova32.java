import java.util.Scanner;

public class prova32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nome[] = new String[n];
		double preco[] = new double[n];
		double peso[] = new double[n];
		double somaMedia = 0;
		int quantMedia = 0;
		double totalMedia = 0;
		for (int i = 0; i<n; i++) {
			nome[i] = sc.next();
			sc.nextLine();
			preco[i] = sc.nextDouble();
			peso[i] = sc.nextDouble();
			if (preco[i]>= 10 && preco[i]<=15) {
				somaMedia += preco[i];
				quantMedia++;
			}
		}
		totalMedia = somaMedia/quantMedia;
		int maisCaro = 0;
		for (int i = 0; i<n; i++) {
			if (preco[i]>maisCaro) {
				maisCaro+=preco[i];
			}
		}
		System.out.println(nome[maisCaro]);
	}

}
