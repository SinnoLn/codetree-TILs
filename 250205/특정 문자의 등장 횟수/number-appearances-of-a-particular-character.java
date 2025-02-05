import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1 = 0;
        int cnt2 = 0;

        String s = sc.next();
        for(int i=0; i<s.length()-1; i++){
            if(s.substring(i, i+2).equals("ee")) cnt1++;
            if(s.substring(i, i+2).equals("eb")) cnt2++;
        }
        System.out.print(cnt1 + " " + cnt2);
    }
}