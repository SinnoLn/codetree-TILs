import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        String num = Integer.toString(a+b);
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)=='1') ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}