import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum+=s.charAt(i)-'0';
        }
        System.out.println(sum);
        sc.close();
    }
}