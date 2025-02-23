import java.util.*;

public class Main {
    public static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<6-2; i++){
            for(int j=i+1; j<6-1; j++){
                for(int k=j+1; k<6; k++){
                    int tmpSum = arr[i] + arr[j] + arr[k];
                    int tmpSum2 = sum-tmpSum;
                    int diff = Math.abs(tmpSum2-tmpSum);
                    minDiff = Math.min(minDiff,diff);
                }
            }
        }
        System.out.println(minDiff);

        sc.close();
    }
}