import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sArr = new ArrayList<>();
        int stage = 1;
        int allNum = 0;
        while(true){
            String s = sc.next();
            if(s.charAt(0) == '0') break;
            allNum++;
            if(stage%2==1) sArr.add(s);
            stage++;
        }
        System.out.println(allNum);
        for(String ss : sArr) System.out.println(ss);
        sc.close();
    }
}