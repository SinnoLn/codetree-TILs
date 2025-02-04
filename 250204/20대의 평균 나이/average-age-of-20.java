import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0, people = 0;

        while(true){
            int age = sc.nextInt();
            if(age/10 != 2) break;

            people++;
            sum+=age;
        }
        sum = Math.round((sum/people)*100.0)/100.0;
        
        System.out.printf("%.2f",sum);
    }
}