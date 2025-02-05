import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] sArr = {"apple", "banana", "grape",  "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;

        for(int i=0; i<sArr.length; i++){
            if(sArr[i].charAt(2) == s.charAt(0) || sArr[i].charAt(3) == s.charAt(0)){
                System.out.println(sArr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}