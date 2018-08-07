import java.util.Scanner;

public class URI11012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada1 = sc.nextInt();
		int entrada2 = sc.nextInt();
		int total = 0;
		do {
			while ( entrada2 <= entrada1) {
			System.out.print(entrada2 + " ");
			total = total + entrada2;
			entrada2++;
			System.out.print("Sum=" + total);
		}
		
	
		} while (entrada1 > 0);
		
	}
}
	

