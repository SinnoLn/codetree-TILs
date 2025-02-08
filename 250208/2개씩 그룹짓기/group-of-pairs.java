import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n*2];
        for(int i=0; i<n*2; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length/2; i++){
            int tmp = arr[i] + arr[arr.length-1-i];
            if(max < tmp) max = tmp; 
        }
        System.out.println(max);
    }
}