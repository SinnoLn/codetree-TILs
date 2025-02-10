import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 1;
        int maxVal = 1;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i==0 || arr[i]<=arr[i-1]){
                if(maxVal<cnt) maxVal=cnt;
                cnt = 1;
            }
            else cnt++;
        }
        if(cnt>maxVal) maxVal = cnt;
        System.out.println(maxVal);
        sc.close();
    }
}