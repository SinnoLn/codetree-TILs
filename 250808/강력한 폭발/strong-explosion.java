import java.io.*;
import java.util.*;

//폭탄 가장 많이 터트리기
public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int maxArea;

    //1번
    static int[] dy1 = {0,1,2,-1,-2};
    static int[] dx1 = {0,0,0,0,0};
    //2번
    static int[] dy2 = {0,-1,0,1,0};
    static int[] dx2 = {0,0,-1,0,1};
    //3번
    static int[] dy3 = {0,-1,1,-1,1};
    static int[] dx3 = {0,-1,-1,1,1};

    static List<int[]> bombLocation = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) bombLocation.add(new int[]{i,j});
            }
        }

        //어쨌든 폭탄을 다 터트리고 최종 개수를 세어야함
        //중복 조합 (순서 고려)
        int[] selectedBombs = new int[bombLocation.size()];
        backtrack(0,selectedBombs);

        System.out.println(maxArea);
    }

    static void backtrack(int idx, int[] selectedBombs){
        if (idx == bombLocation.size()) {
            calMaxArea(selectedBombs);
            return;
        }

        for (int type = 1; type <= 3; type++) {
            selectedBombs[idx] = type;
            backtrack(idx + 1, selectedBombs);
        }
    }

    public static void calMaxArea(int[] selectedBombs) {
    boolean[][] visited = new boolean[n][n];
    
    // 모든 폭탄에 대해 폭발 시뮬레이션
    for (int i = 0; i < bombLocation.size(); i++) {
        int y = bombLocation.get(i)[0];
        int x = bombLocation.get(i)[1];
        int type = selectedBombs[i];

        int[] dx = {};
        int[] dy = {};

        if (type == 1) {
            dx = dx1;
            dy = dy1;
        } else if (type == 2) {
            dx = dx2;
            dy = dy2;
        } else {
            dx = dx3;
            dy = dy3;
        }

        for (int j = 0; j < dx.length; j++) {
            int ny = y + dy[j];
            int nx = x + dx[j];

            if(ny<0 || ny >= n || nx<0 || nx >= n) continue;
            if(visited[ny][nx]) continue;

            visited[ny][nx] = true;
        }
    }

    int currentArea = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (!visited[i][j]) continue;
                currentArea++;
            }
        }
        maxArea = Math.max(maxArea, currentArea);
    }   
}