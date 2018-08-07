import java.util.Scanner;
public class EXEMPLOCALCULADORA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira dois numeros A e B");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double soma = A+B;
		System.out.println("Soma = "+soma);
		double subtracao = A-B;
		System.out.println("Subtracao = "+subtracao);
		double multiplicacao = A*B;
		System.out.println("Multiplicacao = "+multiplicacao);
		double divisao = A/B;
		System.out.println("Divisao = "+divisao);
	}

}
