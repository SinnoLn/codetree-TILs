import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] sArr = new String[n];
        for(int i =0; i<n; i++) sArr[i] = sc.next();
        Arrays.sort(sArr);

        for(String s : sArr) System.out.println(s);
        sc.close();
    }
}