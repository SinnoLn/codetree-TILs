import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal = 0;
        int minVal = 21;


        for(int i=0; i<3; i++){
            String s = sc.next();
            int len = s.length();

            if(len<minVal) minVal = len;
            if(len>maxVal) maxVal = len;
        }

        System.out.println(maxVal-minVal);
    }
}