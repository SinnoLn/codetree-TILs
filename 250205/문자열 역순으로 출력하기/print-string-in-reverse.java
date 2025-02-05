import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String[] sArr = new String[4];
        for(int i=0; i<4; i++){
            sArr[i] = sc.next();
        }

        for(int i=3; i>=0; i--){
            System.out.println(sArr[i]);
        }
    }
}