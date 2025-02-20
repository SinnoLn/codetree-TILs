import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int maxLen = 0;
        char[] arr = new char[10000];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[num-1] = c;
            maxLen = Math.max(num,maxLen);
        }

        int ans = 0;
        for(int i=0; i<maxLen-k+1; i++){
            int sum = 0;
            for(int j=i; j<i+k+1; j++){
                if(arr[j] == 'G') sum+=1;
                else if(arr[j] == 'H') sum+=2;
            }
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
        sc.close();
    }
}