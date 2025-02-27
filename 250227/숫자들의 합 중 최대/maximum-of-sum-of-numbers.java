import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = 0;
        for(int i = x; i<=y; i++){
            String s = Integer.toString(i);
            int sum = 0;
            for(int j=0; j<s.length(); j++){
                sum+=s.charAt(j)-'0';
            } 
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}