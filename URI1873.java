import java.util.Scanner;

public class URI1873 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		while (entrada>0) {
			entrada--;
			String rajesh = sc.next();
			String sheldon = sc.next();
			if (rajesh.equals(sheldon)) {
				System.out.println("empate");
			} else {
				switch(rajesh) {
				case "spock":
					if (sheldon.equals("tesoura") || sheldon.equals("pedra")) {
						System.out.println("rajesh");
					}else {
						System.out.println("sheldon");
					}
					break;
				case "tesoura":
					if (sheldon.equals("papel") || sheldon.equals("lagarto")) {
						System.out.println("rajesh");
						
					}else {
						System.out.println("sheldon");
					}
					break;
				case "papel":
				if (sheldon.equals("pedra") || sheldon.equals("spock")) {
					System.out.println("rajesh");
				}else {
					System.out.println("sheldon");
				}
				    break;
				case "pedra":
					if (sheldon.equals("lagarto") || sheldon.equals("tesoura")) {
						System.out.println("rajesh");
					}else {
						System.out.println("sheldon");
					}
					break;
				case "lagarto":
					if (sheldon.equals("spock") || sheldon.equals("papel")) {
						System.out.println("rajesh");
					}else {
						System.out.println("sheldon");
					}
					break;
			
			}
		
		
			
		}
	}

}
}
