import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a += 87;
        b %= 10;

        System.out.println(a);
        System.out.println(b);
    }
}
