import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int maxVal = 0;
        for(int i=0;i<n-num+1; i++){
            int sum = 0;
            for(int j=i; j<i+num; j++){
                sum+=arr[j];
            }
            maxVal = Math.max(maxVal, sum);
        }
        System.out.println(maxVal);
        sc.close();
    }
}