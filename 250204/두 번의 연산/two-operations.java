import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 1) num+=3;
        if(num%3==0) num/=3;

        System.out.println(num);
    }
}