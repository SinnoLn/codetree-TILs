import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
        }

        int dy[] = {0,0,-1,1};
        int dx[] = {-1,1,0,0};
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<m; i++){
            int y = sc.nextInt()-1;
            int x = sc.nextInt()-1;
    
            if(visited[y][x]) continue;

            q.add(new int[]{y,x});
            visited[y][x] = true;
            ans++;
            
            while(!q.isEmpty()){
                int[] curr = q.poll();
                int currY = curr[0];
                int currX = curr[1];

                for(int j=0; j<4; j++){
                    int ny = currY + dy[j];
                    int nx = currX + dx[j];

                    if(ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
                    if(visited[ny][nx] == true || arr[ny][nx] == 1) continue;
                    visited[ny][nx] = true;
                    ans++;
                    q.add(new int[] {ny, nx});
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}