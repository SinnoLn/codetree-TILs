import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[2000];
        int n = sc.nextInt(); 
        
        int position = 1000;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            while (num > 0) {
                if (dir == 'R') { 
                    a[position]++;
                    position++; 
                } 
                else { 
                    position--; 
                    a[position]++;
                }
                num--;
            }
        }

        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 1) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
