import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bit = sc.nextInt();
        int bit2 = sc.nextInt();
        String bitNum = sc.next();

        int num = 0;
        for(int i=0; i<bitNum.length(); i++) num = num*bit + bitNum.charAt(i)-'0';

        int[] digit = new int[20];
        int cnt = 0;

        while(true){
            if(num<bit2){
                digit[cnt++] = num;
                break;
            }
            digit[cnt++] = num%bit2;
            num/=bit2;
        }

        for(int i=cnt-1; i>-1; i--) System.out.print(digit[i]);
        sc.close();
    }
}