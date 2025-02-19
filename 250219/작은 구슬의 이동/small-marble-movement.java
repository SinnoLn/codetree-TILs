import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dx[] = {0,1,-1,0};
        int dy[] = {1,0,0,-1};

        int n = sc.nextInt();
        int t = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();

        char d = sc.next().charAt(0);
        int dir = getDir(d);

        while(t>0){
            int nx = dx[dir] + x;
            int ny = dy[dir] + y;

            if(!inRange(nx,ny,n)) dir = 3 - dir;
            else{
                x = nx;
                y = ny;
            }
            t--;
        }

        System.out.println(y + " " + x);

        sc.close();
    }

    public static int getDir(char a){
        if(a == 'D') return 0;
        else if(a == 'R') return 1;
        else if(a == 'L') return 2;
        else return 3;
    }

    public static boolean inRange(int x, int y, int n){
        return (x>0 && x<=n && y>0 && y<=n);
    }
}