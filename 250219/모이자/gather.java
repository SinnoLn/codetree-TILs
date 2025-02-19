import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                sum+=Math.abs(i-j)*arr[j];
            }
            minVal = Math.min(minVal,sum);
        }
        System.out.println(minVal);
        sc.close();
    }
}