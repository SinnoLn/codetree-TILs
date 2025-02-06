import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        while(s.length() != 1){
            int n = sc.nextInt();
            if(n<s.length()) s = s.substring(0,n) + s.substring(n+1);
            else s = s.substring(0, s.length()-1);

            System.out.println(s);
        }
    }
}