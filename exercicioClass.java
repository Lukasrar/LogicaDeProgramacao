import java.util.Scanner;

public class exercicioClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nome[] = new String[n];
		String nomeSub[] = new String[n];
		int nomeSubInt[] = new int[n];
		int maiorNota = 0;
		String maiorNotaAluno = "";
		int posNome = 0;
		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			nomeSub[i] = nome[i].substring(nome[i].length()-2);
			nomeSubInt[i] = Integer.parseInt(nomeSub[i]);
			if (nomeSubInt[i] > maiorNota) {
				maiorNotaAluno = nome[i].substring(0, nome[i].length()-18);
				maiorNota = nomeSubInt[i];
				posNome = i;
			}
		}
		System.out.println("O Aluno "+maiorNotaAluno+" tirou a nota igual a "+maiorNota);
	}

}