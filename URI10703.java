import java.util.Scanner;

public class URI10703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 0;

		if (x % 2 == 0) {
			x++;

		}
		while (i < 6) {
			System.out.println(x);
			x = x + 2;
			i++;
		}
	}

}
