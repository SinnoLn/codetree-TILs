import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addInt(n));
        sc.close();
    }
    public static int addInt(int n){
        int sum = 0;
        for(int i=1; i<n+1; i++){
            sum+=i;
        }
        return sum/10;
    }
}