import java.util.Scanner;

public class URI1329 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maria = 0;
		int joao = 0;
		
		int jogo = sc.nextInt();
		do {
			int coroa = 0;
			
			for (int i = 0; i < jogo; i++) {
				coroa = sc.nextInt();
				if (coroa == 0) {
					maria++;

				} else {
					joao++;
				}

			}
			
			System.out.println("Mary won " +maria+ " times and John won " + joao + " times");
			maria = 0;
			joao = 0;

		} while (jogo > 0);

	}
}