import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            arr[i][0] = x1;
            arr[i][1] = x2; 
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        int ans = 0;
        int count  = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1][1]> arr[i][1]) count++;
            else if(count>1){
                ans += count;
                count = 1;
            }
        }
        System.out.println(n - ans);
        sc.close();
    }
}