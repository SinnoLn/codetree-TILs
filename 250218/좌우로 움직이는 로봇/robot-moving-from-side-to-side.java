import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[1000009];
        int b[] = new int[1000009];

        int timeA = 0;
        int posA = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'R'){
                while(num>0){
                    timeA++;
                    posA++;
                    a[timeA] = posA; 
                    num--;
                }
            }
            else if (dir == 'L'){
                while(num>0){
                    timeA++;
                    posA--;
                    a[timeA] = posA; 
                    num--;
                }
            }
        }

        int timeB = 0;
        int posB = 0;
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'R'){
                while(num>0){
                    timeB++;
                    posB++;
                    b[timeB] = posB; 
                    num--;
                }
            }
            else if (dir == 'L'){
                while(num>0){
                    timeB++;
                    posB--;
                    b[timeB] = posB; 
                    num--;
                }
            }
        }
        
        int maxTime = Math.max(timeA, timeB);
        for (int i = 1; i <= maxTime; i++) {
            if (i > timeA) a[i] = a[i - 1];
            if (i > timeB) b[i] = b[i - 1];
        }

        int cnt = 0;
        for(int i=2; i<maxTime+1; i++){
            if(a[i]==b[i] && a[i-1]!=b[i-1]) cnt++; 
        }
        System.out.println(cnt);
        sc.close();
    }
}