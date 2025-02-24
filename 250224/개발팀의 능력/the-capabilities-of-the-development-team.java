import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sumPoint = 0;
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            sumPoint+=arr[i];
        }

        int ans = Integer.MAX_VALUE;
        int min_point = Integer.MAX_VALUE;
        int max_point = Integer.MIN_VALUE;

        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){

                for(int n=0; n<5; n++){
                    for(int m=n+1; m<5; m++){
                        if(i==n || i==m || j==n || j==m) continue;
                        int team1 = arr[i] + arr[j];
                        int team2 = arr[n] + arr[m];
                        int team3 = sumPoint - team1 - team2;

                        if(team1 == team2 || team2 == team3 || team1 == team3) continue;

                        max_point = Math.max(team1, Math.max(team2, team3));
                        min_point = Math.min(team1, Math.min(team2, team3));
                        
                        ans = Math.min(ans, max_point-min_point);
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE) ans = -1;
        System.out.println(ans);
        sc.close();
    }
}