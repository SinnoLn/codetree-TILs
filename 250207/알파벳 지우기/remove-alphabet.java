import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String tmp="";
        int sum = 0;
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))) tmp+=a.charAt(i);
        }
        sum+=Integer.parseInt(tmp);

        tmp= "";
        for(int i=0;i<b.length(); i++){
            if(Character.isDigit(b.charAt(i))) tmp+=b.charAt(i);
        }
        sum+=Integer.parseInt(tmp);

        System.out.println(sum);
        sc.close();
    }
}