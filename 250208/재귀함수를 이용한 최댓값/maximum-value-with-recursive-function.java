import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(maxVal(arr,0));
    }
    public static int maxVal(int[] arr, int index){
        if(index == arr.length) return -1;
        return Math.max(arr[index],maxVal(arr,index+1));
    }
}