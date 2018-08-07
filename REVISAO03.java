import java.util.Scanner;

public class REVISAO03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carteira = "";
		int psicotecnico = 0;
        System.out.println("Ja possui carteira(S/N)?");
        carteira = carteira.replace(S, 1);
        if (carteira == S) {
        	psicotecnico = sc.nextInt();
        	if (psicotecnico > 8) {
        		System.out.println("APROVADO");
        	}
        }
	}

}
