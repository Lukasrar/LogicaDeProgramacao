import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float triangulo = ((a * c))/2;
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		double circulo = (3.14159 * c * c);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		double trapezio = ((a + b) * c)/2;
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		double quadrado = (b * b);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		double retangulo = (a * b);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
	}

}
