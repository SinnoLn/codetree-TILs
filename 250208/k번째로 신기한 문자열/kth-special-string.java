import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String target = sc.next();
        ArrayList<String> sArr = new ArrayList<>();
        for(int i=0; i<n;i++){
            String tmp = sc.next();
            if(tmp.indexOf(target)==0) sArr.add(tmp);
        }
        Collections.sort(sArr);
        System.out.println(sArr.get(k-1));
        sc.close();
    }
}