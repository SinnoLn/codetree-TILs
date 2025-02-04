import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        while(b>=a){
            System.out.print(b + " ");
            b-=2;
        }
    }
}