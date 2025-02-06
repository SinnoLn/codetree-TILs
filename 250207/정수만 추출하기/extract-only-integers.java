import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String tmp = "";
        for(int i=0; i<a.length(); i++){
            if(!Character.isDigit(a.charAt(i))){
                a = tmp;
                break;
            }
            tmp+=a.charAt(i);
        }
        tmp = "";
        for(int i=0; i<b.length(); i++){
            if(!Character.isDigit(b.charAt(i))){
                b = tmp;
                break;
            }
            tmp+=b.charAt(i);
        }
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        sc.close();
    }
}