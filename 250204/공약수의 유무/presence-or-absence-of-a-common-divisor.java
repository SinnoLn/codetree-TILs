import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++){
            if(1920%i==0 && 2880%i==0){
                System.out.println(1);
                check = true;
                break;
            }
        }

        if(!check) System.out.println(0);
    }
}