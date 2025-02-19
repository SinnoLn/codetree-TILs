import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0, y = 0;
        int dir = 0;
        char[][] cArr = new char[n][m];
        char a = 'A';
        cArr[y][x] = a;
        for(int i=1; i<n*m; i++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx>=m || ny>=n || nx<0 || ny<0 || cArr[ny][nx] != '\0'){
                dir = (dir+1)%4;
                nx = dx[dir] + x;
                ny = dy[dir] + y;
            }
            x = nx;
            y = ny;
            a++;
            if(a > 'Z') a = 'A';
            cArr[y][x] = a;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(cArr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}