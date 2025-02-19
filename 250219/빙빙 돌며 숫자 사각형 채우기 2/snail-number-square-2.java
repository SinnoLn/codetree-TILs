import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        int dir = 0;
        int x = 0;
        int y = 0;
        arr[y][x] = 1;
        for(int index=2; index<n*m+1; index++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(ny<0 || nx<0 || ny>=n || nx>=m || arr[ny][nx] != 0) {
                dir = (dir+1)%4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
            arr[y][x] = index;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}