import java.util.*;

public class Main {
    public static int n;
    public static int c;
    public static int g;
    public static int h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            
            start = Math.min(start, arr[i][0]);
            end = Math.max(end, arr[i][1]);
        }

        //범위 여유롭게 설정
        start -=5;
        end +=5;

        int ans = 0;
        for(int i=start; i<end; i++){
            int tmp = checkRange(arr, i);
            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);

        sc.close();
    }

    public static int checkRange(int[][] arr, int temp){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+= calWork(arr[i][0], arr[i][1], temp);
        }
        return sum;
    }

    public static int calWork(int t1, int t2, int temp){
        if(t1>temp) return c;
        else if(t1 <= temp && t2 >= temp) return g;
        else return h;
    }
}