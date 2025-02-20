import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] wb = new char[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                wb[i][j] = sc.next().charAt(0);
            }
        }
        
        int ans = 0;
        char start = wb[0][0];
        char end = wb[n-1][m-1];

        for(int i=1; i<n-2; i++){
            for(int j=1; j<m-2; j++){
                for(int k=i+1; k<n-1; k++){
                    for(int l=j+1; l<m-1; l++){
                        if(wb[i][j] == end && wb[k][l] == start) ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}