import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] tmp = new int[m];

        for(int i=0; i<n; i++)arr1[i] = sc.nextInt();
        for(int i=0; i<m; i++)arr2[i] = sc.nextInt();
        Arrays.sort(arr2);

        int ans = 0;
        for(int i=0; i<n-m+1; i++){
            for(int j=0; j<m; j++){
                tmp[j] = arr1[i+j];
            }
            Arrays.sort(tmp);
            if(Arrays.equals(tmp,arr2)) ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}