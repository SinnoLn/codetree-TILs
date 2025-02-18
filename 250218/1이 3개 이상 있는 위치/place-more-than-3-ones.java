import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return (x>=0 && x<n && y>=0 && y<n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int cnt = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int dirNum = 0; dirNum<4; dirNum++){
                    int nx = i + dx[dirNum];
                    int ny = j + dy[dirNum];

                    if(inRange(nx, ny, n) && arr[nx][ny]==1) cnt++;
                }
                if(cnt>2) ans++;
                cnt = 0;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}