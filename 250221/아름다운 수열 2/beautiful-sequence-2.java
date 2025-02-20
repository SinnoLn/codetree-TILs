import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] num = new int[101];

        for(int i=0; i<n; i++)arr1[i] = sc.nextInt();
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
            num[arr2[i]]++;
        }

        int ans = 0;
        for(int i=0; i<n-m+1; i++){
            int[] tmp = new int[101];
            for(int j=i; j<i+m; j++){
                tmp[arr1[j]]++;
            }
            if(check(num,tmp)) ans++; 
        }
        System.out.println(ans);
        sc.close();
    }
    public static boolean check(int[] num, int[] tmp){
        for(int i=1; i<101; i++){
            if(num[i] != tmp[i]) return false;
        }
        return true;
    }
}