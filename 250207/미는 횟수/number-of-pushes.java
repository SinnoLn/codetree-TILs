import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int len = a.length();
        int num = 0;
        for(int i = 1; i<len+1; i++){
            a = a.substring(len-1, len) + a.substring(0,len-1);
            num++;
            if(a.equals(b)){
                System.out.println(num);
                break;
            }
        }
        if(num == len) System.out.println(-1);
        sc.close();
    }
}