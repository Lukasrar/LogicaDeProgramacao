import java.util.Scanner;
public class URI1008 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int NF = sc.nextInt();
	int HT = sc.nextInt();
	double VP = sc.nextDouble();
	double SALARY = ( HT * VP );
	System.out.println("NUMBER = "+ NF);
	System.out.printf("SALARY = U$ %.2f%n",SALARY);
    sc.close();
	}

}
