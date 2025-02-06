
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String target = sc.next();
        int ans = 0;

        for(int i=0; i<n; i++){
            String s = sc.next();
            if(s.equals(target)) ans++;
        }

        System.out.println(ans);
        sc.close();
    }
}