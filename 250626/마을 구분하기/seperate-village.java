import java.io.*;
import java.util.*;

public class Main {
    static int n,cnt;
    static int[] dy = {0,1,0,-1};
    static int[] dx = {1,0,-1,0};
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] || map[i][j] == 0) continue;
                cnt = 0;
                dfs(i,j);
                ans++;
                list.add(cnt);
            }
        }

        Collections.sort(list);
        System.out.println(ans);
        for(int i : list){
            System.out.println(i);
        }
    }

    static void dfs(int y, int x){
        visited[y][x] = true;
        cnt++;
        for(int dir = 0; dir<4; dir++){
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if(ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
            if(visited[ny][nx] || map[ny][nx] == 0) continue;

            visited[ny][nx] = true;
            dfs(ny,nx);
        }
    }
}