import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                int tmp = arr[i] + arr[j];
                minVal = Math.min(minVal, Math.abs(sum - tmp - target));
            }
        }
        System.out.println(minVal);
        sc.close();
    }
}