import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'R'){
                for(int j=0; j<num-1; j++) arr[j+10]++;
            }
            else{
                for(int j=0; j<num-1; j++) arr[j]++;
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>1) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}