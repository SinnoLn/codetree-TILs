import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        int[][] arr = new int[n][n];
        String s = sc.next();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
        }
        int x = n/2;
        int y = n/2;
        int dir = 3;
        int ans = arr[y][x];

        for(int i=0; i<t; i++){
            char op = s.charAt(i);

            if(op == 'R') dir = (dir+1)%4;
            else if(op == 'L') dir = (dir+4-1)%4;
            else if(op == 'F'){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
                x = nx;
                y = ny;
                ans+=arr[y][x];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}