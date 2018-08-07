import java.util.Scanner;

public class REVISAO02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double rendaMensal = sc.nextDouble();
        double precoDoCarro = sc.nextDouble();
        double entrada = 0;
        double prestacao = 0;
        if (rendaMensal >= 1000) {
        entrada = (precoDoCarro*0.60);
        System.out.println(+entrada);
        } else if (rendaMensal >= 2000) {
        entrada = (precoDoCarro*0.40);
        System.out.println(+entrada);
        }else if (rendaMensal >= 5000) {
        entrada = (precoDoCarro*0.20);
        }else if(rendaMensal > 5000) {
        entrada = (precoDoCarro*0.10);
        }
	}

}
