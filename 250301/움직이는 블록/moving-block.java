import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr  = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int avg = sum/n;

        int count = 0;
        for(int i=0; i<n; i++){
            count+=Math.abs(avg - arr[i]);
        }
        System.out.println(count/2);
        sc.close();
    }
}