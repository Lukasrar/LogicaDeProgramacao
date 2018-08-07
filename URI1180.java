import java.util.Scanner;
public class URI1180 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N, x, min = 0, position = 0;
		N = input.nextInt();
		int X[] =new int[N+1];
		for (int i = 0; i < N; i++) {
			x = input.nextInt();
			X[i] = x;
			
			if (X[i+1] < X[i]) {
				min = X[i + 1];
				position = i + 1;
			}else {
				min = X[i];
				position = i;
			}
		}
		System.out.println("Menor valor: "+min+"\n");
		System.out.println("Posicao: "+position+"\n");
		
	}

}