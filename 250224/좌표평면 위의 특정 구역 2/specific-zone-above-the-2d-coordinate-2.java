import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int max_h = Integer.MIN_VALUE;
            int min_h = Integer.MAX_VALUE;
            int max_w = Integer.MIN_VALUE;
            int min_w = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(i == j) continue;
                max_h = Math.max(max_h, arr[j][0]);
                min_h = Math.min(min_h, arr[j][0]);
                max_w = Math.max(max_w, arr[j][1]);
                min_w = Math.min(min_w, arr[j][1]);
            }
            ans = Math.min(ans, (max_h-min_h)*(max_w-min_w));
        }
        System.out.println(ans);
        sc.close();
    }
}