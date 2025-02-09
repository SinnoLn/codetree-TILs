import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = 0;
        for(int i=0; i<s.length(); i++) num = num*2 + s.charAt(i)-'0';

        num*=17;

        int[] digit = new int[20];
        int cnt = 0;
        while(true){
            if(num<2){
                digit[cnt++] = num;
                break;
            }
            digit[cnt++] = num%2;
            num/=2;
        }

        for(int i = cnt-1; i>-1; i--) System.out.print(digit[i]);
        sc.close();
    }
}