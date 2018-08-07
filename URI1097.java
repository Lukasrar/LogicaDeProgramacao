
public class URI1097 {

	public static void main(String[] args) {
    int i = 1;
    int j = 7;
    int a = 0;
    while (i<=9) {
    	while (j>=5+a) {
    		
    		System.out.println("I="+i + " J="+j);
    		j--;
    		
    		
    	}
    	a = a +2;
    	i = i +2;
    	j = 7 + a;
    }
	}

}
