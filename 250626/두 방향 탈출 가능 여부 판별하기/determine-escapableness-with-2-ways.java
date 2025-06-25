import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int dy[] = {0,1};
    static int dx[] = {1,0};
    static int ans;
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(ans);
    }

    static void dfs(int y, int x){
        visited[y][x] = true;
        if(y == n-1 && x == m-1){
            ans = 1;
            return;
        }
        for(int dir = 0; dir<2; dir++){
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
            if(map[ny][nx] == 0 || visited[ny][nx]) continue;

            visited[ny][nx] = true;
            dfs(ny, nx);
        }
    }
}