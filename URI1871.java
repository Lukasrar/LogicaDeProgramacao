import java.util.Scanner;

public class URI1871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int n = 0;
		String total = "";
		do{
			m = sc.nextInt();
			n = sc.nextInt();
			if (m == 0 && n == 0) {
				
			}else {
				total = Integer.toString(m + n);
				total = total.replace("0", "");
				System.out.println(total);
			}
			
		}while (m != 0 && n != 0);
	}

}
