import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String order = sc.next();
        int len = s.length();

        for(int i=0; i<order.length(); i++){
            if(order.charAt(i) == 'L') s=s.substring(1)+s.substring(0,1); 
            else s=s.substring(len-1,len) + s.substring(0,len-1);
        }

        System.out.println(s);
    }
}