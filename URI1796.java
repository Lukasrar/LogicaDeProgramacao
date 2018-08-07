import java.util.Scanner;

public class URI1796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int resultadoPositivo = 0;
         int resultadoNegativo = 0;
        for(int entrada = sc.nextInt(); entrada > 0; entrada--) {
        	int  opniao = sc.nextInt();
        	if (opniao == 0) {
        		resultadoPositivo++;
        	}
        	else if (opniao == 1) {
        		resultadoNegativo++;
        	}
        	
        
        }
    	if (resultadoNegativo<resultadoPositivo) {
 	    	System.out.println("Y");
  
    	  } else {
    	    	System.out.println("N");
	    }
        }
}


