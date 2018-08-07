import java.util.Scanner;

public class URISOMANATURAL{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        while(sc.hasNext()) {

            String entrada = sc.next();
            int espacoBranco = 0;
            for(int i = entrada.length();i>0; i--) {

                for(int v = 0;espacoBranco>v;v++) {
                    System.out.print(" ");
                    }

                for(int k = 0; k<i; k++) {
                    if( k == 0){
                       System.out.print(entrada.charAt(k)); 
                    } else { 
                        System.out.print(" " +entrada.charAt(k));
                    }
                }

                System.out.println("");
                espacoBranco++;
            }
        }
        System.out.println("");
    }
}