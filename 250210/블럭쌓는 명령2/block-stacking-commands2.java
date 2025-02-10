import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] block = new int[n];
        for(int i=0;i<k;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=a-1; j<b; j++){
                block[j]++;
            }
        }
        int maxVal = -1;
        for(int i=0; i<n; i++){
            if(block[i]>maxVal) maxVal = block[i];
        }
        System.out.println(maxVal);
        sc.close();
    }
}