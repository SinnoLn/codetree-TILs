import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bit = sc.nextInt();
        int cnt = 0;
        int[] digit = new int[20]; 

        while(true){
            if(num<bit){
                digit[cnt++] = num;
                break;
            }
            digit[cnt++] = num%bit;
            num/=bit;
        }

        for(int i=cnt-1; i>-1; i--) System.out.print(digit[i]);
        sc.close();
    }
}