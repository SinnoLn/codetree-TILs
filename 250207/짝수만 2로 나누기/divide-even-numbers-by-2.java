import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        cal(arr);
        sc.close();

    }
    public static void cal(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0)System.out.print(arr[i]/2 + " ");
            else System.out.print(arr[i] + " ");
        }
    }
}