import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt()+1;

        int ans = 0;
        for(int i=x; i<y; i++){
            String s = Integer.toString(i);
            if(CheckInterest(s)) ans++;
        }
        System.out.println(ans);
        sc.close();
    }

    public static boolean CheckInterest(String num){
        char c = num.charAt(0);
        int count = 0;
        for(int i=1; i<num.length(); i++){
            if(c == num.charAt(i)) count++;
        }
        if((count == 0) || (count == num.length()-1)) return true;
        return false;
    }
}