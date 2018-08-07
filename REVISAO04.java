import java.util.Scanner;

public class REVISAO04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = 0;
	    float b = 0;
       do {
    	a = sc.nextFloat();
        b = sc.nextFloat();
       if (a < b ) {
    	   System.out.println("Menor = "+a);
       }else if (b < a) {
    	   System.out.println("Menor = "+b);
       }else if (b == a) {
    	   System.out.println(b);
       }else if (a == b) {
    	   System.out.println(a);
       }else if (a == 0 && b == 0) {}
	}while (a != 0.0 && b != 0.0);

}
}
