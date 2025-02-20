import java.util.*;

class CheckPoint {
    int x, y;
    public CheckPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckPoint[] cp = new CheckPoint[n];

        for(int i=0; i<n; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            cp[i] = new CheckPoint(y,x);
        }

        int ans = Integer.MAX_VALUE;
        int maxDistance = 0;
        //총 거리 계산
        for(int j=0; j<n-1; j++){
            maxDistance+=Math.abs(cp[j].x-cp[j+1].x)+Math.abs(cp[j].y-cp[j+1].y);
        }

        //하나씩 건너뛰고 연결
        for(int i=1; i<n-1; i++){
            int removeDis = Math.abs(cp[i-1].x-cp[i].x)+Math.abs(cp[i-1].y-cp[i].y)  + Math.abs(cp[i].x-cp[i+1].x)+Math.abs(cp[i].y-cp[i+1].y);
            int addDis =  Math.abs(cp[i-1].x-cp[i+1].x)+Math.abs(cp[i-1].y-cp[i+1].y);

            int tmp = maxDistance - removeDis + addDis;
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
        sc.close();
    }
}