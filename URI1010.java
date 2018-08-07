import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cod = sc.nextInt();
    int num1 = sc.nextInt();
    double valor1 = sc.nextDouble();
    int cod2 = sc.nextInt();
    int num2 = sc.nextInt();
    double valor2 = sc.nextDouble();
    double valorAPagar = (num1 * valor1) + (num2 * valor2);
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
    sc.close();
    
  
	}

}
