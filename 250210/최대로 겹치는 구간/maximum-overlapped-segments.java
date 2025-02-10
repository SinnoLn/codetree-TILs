import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200];

        //전부 더하기 100해주기
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a; j<b; j++) arr[j+100]++;
        }

        int maxVal = -1;
        for(int i=0; i<arr.length;i++){
            if(maxVal<arr[i]) maxVal = arr[i];
        }
        System.out.println(maxVal);
        sc.close();
    }
}