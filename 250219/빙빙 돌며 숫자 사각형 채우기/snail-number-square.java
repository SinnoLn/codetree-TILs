import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {1,0,-1,0}; //오른쪽, 아래, 왼쪽, 위
        int[] dy = {0,1,0,-1};
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        int y = 0;
        int dir = 0;

        int ans[][] = new int[n][m];

        for(int index=1; index<n*m+1; index++){
            ans[y][x] = index;
            int nx = dx[dir] + x;
            int ny = dy[dir] + y;

            if(!inRange(nx,ny,n,m) || ans[ny][nx] != 0){
                dir = (dir+1)%4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
    public static boolean inRange(int x, int y, int n, int m){
        return (x<m && x>=0 && y<n && y>=0);
    }
}