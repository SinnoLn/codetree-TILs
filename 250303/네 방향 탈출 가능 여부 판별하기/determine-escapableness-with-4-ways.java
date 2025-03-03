import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr  = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        } 

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int ans = 0;

        q.add(new int[] {0,0});
        visited[0][0] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int currY = curr[0];
            int currX = curr[1];

            if(currY == (n-1) && currX == (m-1)) {
                ans = 1;
                break;
            }

            for(int i=0; i<4; i++){
                int nextY = currY + dy[i];
                int nextX = currX + dx[i];

                if(nextX < 0 || nextY < 0 || nextX >=m || nextY >=n) continue;
                if(visited[nextY][nextX] == true || arr[nextY][nextX] == 0) continue;
                visited[nextY][nextX] = true;

                q.add(new int[] {nextY, nextX});
            }
        }
        System.out.println(ans);
        sc.close();
    }
}