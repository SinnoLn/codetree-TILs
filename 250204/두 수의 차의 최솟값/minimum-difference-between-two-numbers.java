import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int minVal = Integer.MAX_VALUE;

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]-arr[i]<minVal) minVal = arr[j]-arr[i];
            }
        }

        System.out.println(minVal);

    }
}