import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String find = sc.next();

        while(s.indexOf(find) != -1){
            int index = s.indexOf(find);
            s = s.substring(0,index) + s.substring(index+find.length());
        }

        System.out.println(s);
    }
}