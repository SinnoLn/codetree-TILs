import java.util.*;

public class Main {
    public static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(cal(a,b));
        }

    }
    public static int cal(int a, int b){
        int sum=0;
        for(int i=a-1; i<b; i++){
            sum+=arr[i];
        }
        return sum;
    }
}