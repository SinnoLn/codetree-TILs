import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int wifi = 0;
        int position = 0;
        if (m == 0){
            for(int i=0; i<n; i++) if(arr[i]==1) wifi++;
            System.out.println(wifi);
            return;
        } 

        while(true){
            if(arr[position] == 1){
                position+=2*m;
                if(position > n-1) break;
                wifi++;
            }
            else position++;
        }
        if(wifi == 0) wifi = 1;
        
        System.out.println(wifi);
        sc.close();
    }
}