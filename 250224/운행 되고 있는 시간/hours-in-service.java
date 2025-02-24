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

        int ans = 0;
        for(int i=0; i<n; i++){
            int[] time = new int[1001];
            for(int j=0; j<n; j++){
                if(i == j) continue;
                for(int k=arr[j][0]; k<arr[j][1]; k++) time[k]++;
            }
            int tmp = 0;
            for(int j=1; j<1001; j++){
                if(time[j] > 0) tmp++;
            } 
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
        sc.close();
    }
}