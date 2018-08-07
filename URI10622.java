import java.util.Scanner;

public class URI10622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 1; System.out.println(i);
		
		while (i < x-1 ) {
			i= i+2;
			System.out.println(i);
		}
		sc.close();
	}

}
