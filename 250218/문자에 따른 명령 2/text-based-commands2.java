import java.util.*;

public class Main {
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int dir = 3;
        String s = sc.next();

        for(int i=0; i<s.length(); i++){
            char op = s.charAt(i);

            if(op == 'L') dir = (dir-1+4)%4;
            else if(op == 'R') dir = (dir+1)%4;
            else {
                x+=dx[dir];
                y+=dy[dir];
            }
        }
        System.out.println(x + " " + y);
        sc.close();
    }
}