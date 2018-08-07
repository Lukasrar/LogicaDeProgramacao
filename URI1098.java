
public class URI1098 {

	public static void main(String[] args) {
		double i = 0;
		double j = 1;
		double a = 0;
		while (i <= 2) {
			while (j <= 3 + a) {
				System.out.printf("i=%.1f",i);
				System.out.printf(" j=%.1f%n", j);
				j++;
			}
			i = i + 0.2;
			a = a + 0.2;
			j = 1 + a;
		}
	}

}
