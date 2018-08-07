import java.util.Scanner;

public class URI10673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int impar = 1; System.out.println(impar);
				
		while(impar < numero - 1) {
			impar = impar +2;
			System.out.println(impar);
		}
	}

}
