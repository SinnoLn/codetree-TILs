import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

       int dis1[] = new int[1000000];
       int dis2[] = new int[1000000];

       int pos = 0;
       int time = 0;
       for(int i=0; i<n; i++){
            char dir = sc.next().charAt(0);
            int num = sc.nextInt();

            while(num>0){
                if(dir == 'R'){
                    dis1[time] = pos;
                    time++;
                    pos++; 
                }
                else if(dir == 'L'){
                    pos--;
                    dis1[time] = pos;
                    time++; 
                }
                num--;
            }
       }

       pos = 0;
       time = 0;
       for(int i=0; i<m; i++){
            char dir = sc.next().charAt(0);
            int num = sc.nextInt();

            while(num>0){
                if(dir == 'R'){
                    dis2[time] = pos;
                    time++;
                    pos++; 
                }
                else if(dir == 'L'){
                    pos--;
                    dis2[time] = pos; 
                    time++;
                }
                num--;
            }
       }

       boolean check = false;
       for(int i=0; i<time+1; i++){
        if(dis1[i]==dis2[i]){
            System.out.println(i);
            check = true;
            break;
        }
       }
       if(!check){
            System.out.println(-1);
        }
        sc.close();
    }
}