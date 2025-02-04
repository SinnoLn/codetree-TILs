import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(num%2==0) ans++;
        }

        System.out.println(ans);
    }
}