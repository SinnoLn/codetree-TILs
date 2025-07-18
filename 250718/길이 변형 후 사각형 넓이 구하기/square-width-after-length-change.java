import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt()+8;// 가로
        int height = sc.nextInt()*3;// 세로

        int area = width * height;

        System.out.println(width);
        System.out.println(height);
        System.out.println(area);

        sc.close();
    }
}
