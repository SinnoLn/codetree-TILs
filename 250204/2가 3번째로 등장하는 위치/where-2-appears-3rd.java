import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();

        for(int i=0;i <n; i++){
            int num = sc.nextInt();
            if(num == 2) cnt++;
            if(cnt == 3){
                System.out.println(i+1);
                break;
            }
        }
    }
}