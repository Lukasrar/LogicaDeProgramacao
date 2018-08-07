import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int primeiro = 1;
    	int segundo = 2;
    	int terceiro = 3;
        while (i > 0) {
        	
        	System.out.print(primeiro+ " ");
        	System.out.print(segundo+ " ");
        	System.out.println(terceiro+ " " +"PUM");
        	primeiro = primeiro + 4;
            segundo = segundo +4;
            terceiro = terceiro + 4;
        	i--;
        }
        sc.close();
	}

}
