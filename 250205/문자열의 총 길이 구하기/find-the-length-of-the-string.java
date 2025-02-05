import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  ans = "";

        for(int i=0; i<10; i++){
            String s = sc.next();
            ans+=s;
        }

        System.out.println(ans.length());
    }
}