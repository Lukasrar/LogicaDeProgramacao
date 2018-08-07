import java.util.Scanner;

public class exercicioClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nome[] = new String[n];
		String nomeSub[] = new String[n];
		int nomeSubInt[] = new int[n];
		int maiorNota = 99999999;
		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			nomeSub[i] = nome[i].substring(nome[i].length() - 2);
			nomeSubInt[i] = Integer.parseInt(nomeSub[i]);
			if (nomeSubInt[i] < maiorNota) {
				System.out.println(nomeSubInt[i]);
			}else {
				System.out.println(nomeSubInt[i]);
			}
			
		}
	}

}