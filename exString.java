import java.util.Scanner;

public class exString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		String nome2 = sc.nextLine();
		String nomeSub = nome.substring(nome.length() - 2);
		String nomeSub2 = nome2.substring(nome2.length() - 2);
		int nomeSubInt = Integer.parseInt(nomeSub);
		int nomeSubInt2 = Integer.parseInt(nomeSub2);
		if (nomeSubInt > nomeSubInt2) {
			System.out.println(nomeSubInt);
		} else {
			System.out.println(nomeSubInt2);
		}
	}

}