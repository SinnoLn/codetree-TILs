import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] room = new int[n];

        for(int i=0; i<n; i++){
            room[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                int index = (i+j)%5;
                sum+=room[index]*j;
            }
            ans = Math.min(sum, ans);
        }
        System.out.println(ans);
        sc.close();
    }
}