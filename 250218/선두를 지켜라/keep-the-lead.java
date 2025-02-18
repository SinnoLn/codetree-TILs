import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a[] = new int[1000000];
        int b[] = new int[1000000];

        int time = 0;
        int dis = 0;
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t>0){
                time++;
                dis+=v;
                a[time]=dis;
                t--; 
            }
        }

        time = 0;
        dis = 0;
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t>0){
                time++;
                dis+=v;
                b[time]=dis;
                t--; 
            }
        }

        int cnt = 0;
        int preLeader = 0;
        int leader = 0;
        for(int i=1; i<time; i++){
            if(a[i]<b[i]) leader = 2;
            else if(a[i]>b[i]) leader = 1;

            if(leader != preLeader) cnt++;
            preLeader = leader;
        }
        System.out.println(cnt-1);
        sc.close();
    }
}