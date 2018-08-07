import java.util.Scanner;
public class URI1009 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String NOME = sc.nextLine();
    double SAL = sc.nextDouble();
    double TOTALV = sc.nextDouble();
    double TOTAL = (TOTALV * 0.15) + SAL;
    System.out.printf("TOTAL = R$ %.2f%n",TOTAL);
    sc.close();
    
	}

}
