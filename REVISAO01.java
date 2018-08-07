import java.util.Locale;
import java.util.Scanner;

public class REVISAO01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        double pontos1 = sc.nextDouble();
        double pontos2 = sc.nextDouble();
        double pontos3 = sc.nextDouble();
        double total = 0;
        double faltam = 0;
        total = (pontos1 + pontos2 + pontos3)/3;
        if(total <= 4) {
        	System.out.printf("MEDIA = %.1f%n",total);
        	System.out.println("Reprovado");
        }else if (total > 4 && total < 7) {
        	faltam = 7 - total;
        	System.out.printf("MEDIA = %.1f%n",total);
        	System.out.println("Exame");
        	System.out.printf("Faltaram = %.1f%n",faltam);
        	
        }else if (total >= 7) {
        	System.out.printf("MEDIA = %.1f%n",total);
        	System.out.println("Aprovado");
        }
        
	}

}
