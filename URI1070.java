import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int impar = 0;
	    while (impar < 5) {
				if (x%2 ==1) {
					
					impar++;
					System.out.println( +impar);
					
				}
				impar = impar +1;
			}
			sc.close();
		}
	
	}


