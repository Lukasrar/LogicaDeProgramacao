import java.util.Scanner;
import java.util.Locale;
public class URI1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		
		double media = ( (N1*2) + (N2*3) + (N3*4) + N4*1) / 10;

		
		System.out.printf("Media: %.f\n",media);
		
		if (media >=7) {
			System.out.println("Aluno aprovado. ");
			
		}else if (media <=4.9) {
			System.out.println("Aluno reprovado. ");
		}else {
			System.out.println("Aluno em exame. ");
			double notaExame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f\n",notaExame);
			double mediaFinal = (notaExame + media) /2;
			if (mediaFinal >=5) {
				System.out.println("Aluno aprovado. ");
			}else {
				System.out.println("Aluno reprovado. ");
				} System.out.printf("Media final: %.1f\n",mediaFinal);
		}
		sc.close();
	
	}
	
}
