import java.util.*;

public class Main {
    public static int dx[] = {1,-1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++){
            char dir = sc.next().charAt(0);
            int num = sc.nextInt();

            if(dir == 'E') x+=dx[0]*num;
            else if(dir == 'W') x+=dx[1]*num;
            else if(dir == 'S') y+=dy[2]*num;
            else y+=dy[3]*num;
        }
        System.out.println(x + " " + y);
    }
}