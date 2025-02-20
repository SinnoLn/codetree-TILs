import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)arr[i] = sc.nextInt();

        for(int i=0; i<n-1; i++){
            for(int j=i+2; j<n; j++){
                ans = Math.max(ans, arr[i] + arr[j]);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}