import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a[] = new int[1000000];
        int b[] = new int[1000000];

        int time = 0;
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t>0){
                time++;
                a[time]=v;
                t--; 
            }
        }

        time = 0;
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t>0){
                time++;
                b[time]=v;
                t--; 
            }
        }

        int cnt = 0;
        for(int i=2; i<time; i++){
            if((b[i]>a[i] && b[i-1]<a[i-1]) || (b[i]<a[i] && b[i-1]>a[i-1])){
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}