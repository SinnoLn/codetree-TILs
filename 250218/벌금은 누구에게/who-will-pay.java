import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = -1;

        int[] student = new int[n];

        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            student[num-1]++;

            if(student[num-1]>k-1){
                ans = num;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}