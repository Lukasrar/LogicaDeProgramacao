import java.util.Scanner;

public class prova3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numero[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numero[i][j] = sc.nextInt();
				if (numero[i][j] % 2 == 0) {
					System.out.print(numero[i][j]+" ");
				}
			}
		}
		
		int somaDiagonal=0;
		for(int i = 0; i<n; i++) {
			somaDiagonal+=numero[i][i];
		}
		int somaAcima = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 1; j < n; j++) {
				somaAcima+=numero[i][j];
				
			}
		}
		int somaTotal=0;
		somaTotal = somaDiagonal+somaAcima;
		System.out.println();
		System.out.println(somaAcima);
}
}