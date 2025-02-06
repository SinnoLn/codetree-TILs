import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+= sc.nextInt();
        }
        String ans = Integer.toString(sum);
        ans = ans.substring(1) + ans.substring(0,1);
        System.out.println(ans);
        sc.close();
    }
}