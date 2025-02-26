import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            arr[i] = (x2);
        }

        int ans = 0;
        int count  = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1]> arr[i]) count++;
            else {
                ans += count;
                count = 1;
            }
        }
        System.out.println(n - ans);
        sc.close();
    }
}