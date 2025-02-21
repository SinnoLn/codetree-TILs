import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n-t+1; i++){
            int sum = 0;
            for(int j=0; j<t; j++){
                sum += Math.abs(h-arr[j+i]);
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
        sc.close();
    }
}