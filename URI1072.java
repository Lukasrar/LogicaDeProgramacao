import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		while (n > 0) {
			
		int x = sc.nextInt();
		if (x >= 10 && x <= 20) {
			dentro = dentro + 1;

		} else {
			fora = fora + 1;

		}
		n--;
	
	}


	System.out.println(dentro+ " in");
	System.out.println(fora+ " out");
}
}
