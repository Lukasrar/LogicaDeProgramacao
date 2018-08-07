import java.util.Scanner;

public class URI11422 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int primeiro = 1;
		int segundo = 2;
		int terceiro = 3;
	    
		while (entrada > 0) {
			System.out.println(primeiro+" "+segundo+" "+terceiro+" PUM");
			primeiro +=4;
			segundo +=4;
			terceiro +=4;
			entrada--;
			
			
		}
	sc.close();	
	}

}
