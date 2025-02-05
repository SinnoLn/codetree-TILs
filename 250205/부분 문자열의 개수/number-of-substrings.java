import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String po = sc.next();
        int cnt = 0;

        for(int i=0; i<s.length()-po.length()+1; i++){
            if(s.substring(i,i+po.length()).equals(po)) cnt++;
        }

        System.out.println(cnt);
    }
}