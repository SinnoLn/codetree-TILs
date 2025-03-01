import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int wifiCount = 0; 
        int position = 0;  

        while (position < n) {
        
            int installPos = position + m;
            if (installPos >= n) installPos = n - 1;  

            while (installPos > position && arr[installPos] == 0) {
                installPos--;
            }

            if (installPos != position) wifiCount++;

            position = installPos + m + 1;  
        }

        System.out.println(wifiCount);
        sc.close();
    }
}
