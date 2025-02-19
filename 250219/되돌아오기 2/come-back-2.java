import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int x = 0;
        int y = 0;
        int dir = 3;
        int time = 0;

        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            char op = s.charAt(i);

            if(op == 'F'){
                x = x + dx[dir];
                y = y + dy[dir];
            }
            else if(op == 'R') dir = (dir+1)%4;
            else if(op == 'L') dir = (dir+4-1)%4;
            time++;
            
            if(x == 0 && y == 0){
                System.out.println(time);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}