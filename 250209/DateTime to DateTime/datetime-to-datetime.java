import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int finishTime = a*60*24 + b*60 + c;
        int startTime = 11*60*24 + 11*60 + 11;
        
        if(finishTime-startTime>=0) System.out.println(finishTime-startTime);
        else System.out.println(-1);

        sc.close();
    }
}