import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("END")) break;
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println(reversed);
        }
        sc.close();
    }
}