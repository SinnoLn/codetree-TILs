import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int number = sc.nextInt();
                if(j<=num) sum+=number;
            }
            num++;
        } 
        System.out.println(sum);
    }
}