import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2000];

        int n = sc.nextInt();
        int point = 1000;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if(dir == 'R'){
                while(num>0){
                    arr[point]++;
                    point++;
                    num--;
                }
            }
            else{
                while(num>0){
                    arr[point]++;
                    point--;
                    num--;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>1){
               // System.out.println("arr["+i+"] : " + arr[i]);
                cnt++;
            } 
        }
        System.out.println(cnt);
        sc.close();
    }
}