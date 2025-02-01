import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = a*a;
        
        System.out.println(area);
        if(a<5){
            System.out.println("tiny");
        }
    }
}