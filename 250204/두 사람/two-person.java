import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        char sex1 = sc.next().charAt(0);
        int age2 = sc.nextInt();
        char sex2 = sc.next().charAt(0);

        if((age1 >=19)&&(sex1 == 'M') || (age2 >=19)&&(sex2 == 'M')) System.out.println(1);
        else System.out.println(0);
    }
}