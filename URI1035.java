import java.util.Scanner;
public class URI1035 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int D = sc.nextInt();
	
	/*if (B > C) {
	} else if (D > A) {
	} else if ( (C + D) > (A + B) ) {
	} else if ( C > 0 && D > 0) {
	} else if ( A%2 == 0 ) {	
	 
	}*/
	
	if((B > C) && (D > A) && ( (C + D) > (A + B) )  &&    ( C > 0 && D > 0) &&  ( A%2 == 0 )){ System.out.println("Valores aceitos");
		
	} else {System.out.println("Valores nao aceitos"); }
	
	sc.close();
	}
	
	
}
