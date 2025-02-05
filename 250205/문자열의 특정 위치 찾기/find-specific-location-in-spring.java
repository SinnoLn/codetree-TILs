import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String find = sc.next();

        int i = s.indexOf(find);
        if(i != -1) System.out.println(i);
        else System.out.println("No");
    }
}