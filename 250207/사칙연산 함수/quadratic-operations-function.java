import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int ans=0;

        if(op == '+') ans = num1+num2;
        else if(op == '-') ans = num1-num2;
        else if(op == '*') ans = num1*num2;
        else if(op == '/') ans = num1/num2;
        else {
            System.out.println("False");
            return;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans); 
    }
}