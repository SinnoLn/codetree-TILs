import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        int ans = 0;
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++){
            char c = sc.next().charAt(0);
            int num = sc.nextInt();
            int dir = getDir(c); 

            while(num>0){
                int nx = dx[dir] + x;
                int ny = dy[dir] + y;

                ans++;
                if(nx == 0 && ny == 0){
                    System.out.println(ans);
                    return;
                }
                num--;

                x = nx;
                y = ny;
            }
        }
        System.out.println(-1); 
        sc.close();
    }

    public static int getDir(char c){
        if(c == 'N') return 3;
        else if(c == 'E') return 0;
        else if(c == 'W') return 1;
        else return 2;
    }
}