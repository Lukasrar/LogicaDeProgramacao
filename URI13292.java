import java.util.Scanner;

public class URI13292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maria = 0;
		int joao = 0;
		int jogo = 0;
		do {
			jogo = sc.nextInt();
			if( jogo == 0 ) {}
			else {
			int caroa = 0;
			joao=0;
			maria=0;
			for (int i = 0; i < jogo; i++) {
				caroa = sc.nextInt();
				if (caroa == 0) {
					maria++;
				}else{
					joao++;
				}
				
			}System.out.println("Mary won " +maria+ " times and John won " + joao + " times");}
		}while (jogo > 0);
				
		}
	}


