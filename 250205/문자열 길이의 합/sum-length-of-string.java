import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        String ans = "";
        for(int i=0; i<n; i++){
            String s = sc.next();
            ans+=s;
            if(s.charAt(0) == 'a') cnt++;
        }
        System.out.print(ans.length() + " " + cnt);
    }
}