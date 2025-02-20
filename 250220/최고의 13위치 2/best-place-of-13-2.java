import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                for(int k=0; k<n; k++){
                    for(int m=0; m<n-2; m++){
                        if(i==k && (j<=m+2 && m<=j+2)) continue;
                        int tmp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[k][m] + arr[k][m+1] + arr[k][m+2];
                        ans = Math.max(tmp,ans);        
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}