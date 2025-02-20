import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char cArr[][] = new char[n][m];

        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<m; j++){
                cArr[i][j] = s.charAt(j);
            }
        }

        int dx[] = {-1,1,0,0,1,1,-1,-1};
        int dy[] = {0,0,1,-1,1,-1,1,-1};

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(cArr[i][j] == 'L'){
                    for(int d=0; d<8; d++){
                        int cnt = 0;
                        int nx = j;
                        int ny = i;
                        while(true){
                            nx += dx[d];
                            ny += dy[d];
                            if(ny<0 || nx<0 || ny>=n || nx>=m) break;
                            if(cArr[ny][nx] != 'E') break;
                            cnt++;
                        }
                        if(cnt == 2) ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}