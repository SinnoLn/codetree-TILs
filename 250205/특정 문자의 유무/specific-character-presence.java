import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans1="", ans2="";
        if(s.contains("ee")) ans1 = "Yes";
        else ans1 = "No";
        if(s.contains("ab")) ans2 = "Yes";
        else ans2 = "No";

        System.out.print(ans1 + " " + ans2);
    }
}