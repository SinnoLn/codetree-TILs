import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt()+1;

        int ans = 0;
        for(int i=x; i<y; i++){
            String s = Integer.toString(i);
            if(CheckInterest(s)){
                ans++;
            } 
        }
        System.out.println(ans);
        sc.close();
    }

    public static boolean CheckInterest(String num){
        int[] number = new int[10];
        int count = 0;
        for(int i=0; i<num.length(); i++){
            number[num.charAt(i)-'0']++;
        }
        Arrays.sort(number);

        if(number[9] == (num.length()-1)) return true;
        return false;
    }
}