import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            if(arr[i]%2==0) System.out.print(arr[i] + " ");
        }
    }
}