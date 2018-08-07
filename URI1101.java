import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada1 = 0;
		int entrada2 = 0;
		do {
			entrada1 = sc.nextInt();
			entrada2 = sc.nextInt();
			int total = 0;
			if (entrada1 > 0 && entrada2 > 0) {
				do {
					System.out.print(entrada2 + " ");
					total = total + entrada2;
					entrada2++;

				} while (entrada2 <= entrada1);
				{
					System.out.println("Sum=" + total);
				}
			}

		} while (entrada1 > 0 && entrada2 > 0);
		sc.close();

	}
}
