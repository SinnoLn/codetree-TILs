import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                double sum = 0;
                for(int k=i; k<=j; k++){
                    if(i==j) {
                        ans++;
                        break;
                    }
                    sum+=arr[k];
                }
                sum/=(j-i+1);
                for(int k=i; k<=j; k++){
                    if(arr[k] == sum){
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}