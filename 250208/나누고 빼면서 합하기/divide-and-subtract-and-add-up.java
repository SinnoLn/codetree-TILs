import java.util.*;

public class Main {
    public static int[] arr; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(cal(arr, m));
        sc.close();
    }
    public static int cal(int[] arr, int m){
        int sum = 0;
        while(m > 0){
            sum+=arr[m-1];
            if(m%2==0) m/=2;
            else m-=1;
        }
        return sum;
    }
}