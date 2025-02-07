import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;
        for(int i=a; i<b+1; i++){
            if(checkNum(i)) num++;
        }
        System.out.println(num);
        sc.close();
    }

    public static boolean checkNum(int i){
        return (i%3==0) || checkStringNum(i);
    }

    public static boolean checkStringNum(int i){
        String tmp = Integer.toString(i);

        for(int j=0; j<tmp.length(); j++){
            if(tmp.charAt(j) == '3'||tmp.charAt(j) == '6'||tmp.charAt(j) == '9'){
                return true;
            }
        }
        return false;
    }
}