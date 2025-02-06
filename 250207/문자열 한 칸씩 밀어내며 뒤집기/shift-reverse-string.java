import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();
        int len = s.length();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num == 1){
                s = s.substring(1) + s.substring(0,1);
            }
            else if(num==2){
                s = s.substring(len-1, len) + s.substring(0, len-1);
            }
            else{
                s = new StringBuilder(s).reverse().toString();
            }
            System.out.println(s);
        }
    }
}
