

import java.util.Scanner;

public class URI1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			String x = sc.next();
			int total = 0;
			for(int j = 0; j<x.length(); j++) {	
				switch(x.charAt(j)) {
				case '1':
				total+=2;
				break;
				case '2':
				total+=5;
				break;
				case '3':
				total+=5;
				break;
				case '4':
				total+=4;
				break;
				case '5':
				total+=5;
				break;
				case '6':
				total+=6;
				break;
				case '7':
				total+=3;
				break;
				case '8':
				total+=7;
				break;
				case '9':
				total+=6;
				break;
				case '0':
				total+=6;
				break;
				}
				
			}
			System.out.println(total+" leds");
			total = 0;
		}
	
	}

}
