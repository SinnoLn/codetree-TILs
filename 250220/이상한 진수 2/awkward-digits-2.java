import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int maxNum = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '1') c = '0';
            else c = '1';
            
            String tmp = s.substring(0,i) + c + s.substring(i+1,s.length());
            int num = 0;
            for(int j=0; j<tmp.length(); j++){
                num = num*2+tmp.charAt(j)-'0';
            }
            maxNum = Math.max(maxNum, num);
        }
        System.out.println(maxNum);
        sc.close();
    }
}