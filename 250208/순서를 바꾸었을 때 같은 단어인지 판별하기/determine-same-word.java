import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(checkSame(a,b)) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
    public static boolean checkSame(String a,String b){
        if(a.length() != b.length()) return false;
        char[] cArr1 = a.toCharArray();
        char[] cArr2 = b.toCharArray();
        Arrays.sort(cArr1);
        Arrays.sort(cArr2);

        for(int i=0; i<cArr1.length; i++){
            if(cArr1[i] != cArr2[i]) return false;
        }
        return true;
    }
}