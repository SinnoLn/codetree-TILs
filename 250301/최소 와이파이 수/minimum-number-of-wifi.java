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
        while(true){
            if(arr[position] == 1){
                position+=m;
                wifi++;
                position+=m;
                if(position+m>n) break;
            }
            else position++;
        }
        System.out.println(wifi);
        sc.close();
    }
}