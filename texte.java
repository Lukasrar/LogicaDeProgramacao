import java.util.Scanner;

public class texte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ((a % 2) ==0) {
        	a++;
        	System.out.println(+a);
		}
		sc.close();
	}
}
		