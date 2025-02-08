import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                Arrays.sort(arr, 0,i+1);
                if(i==0)System.out.print(arr[i]+" ");
                else System.out.printf(arr[i/2]+ " ");
            }
        }
        sc.close();
    }
}