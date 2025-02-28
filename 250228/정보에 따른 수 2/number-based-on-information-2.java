import java.util.*;

class Position{
        char word;
        int p;
        public Position(char word, int p){
            this.word = word;
            this.p = p;
        }
    };

public class Main {
    public static List<Position> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt()+1;

        for(int i=0; i<n; i++){
            char c = sc.next().charAt(0);
            int p = sc.nextInt();
            arr.add(new Position(c,p));
        }

        int ans = 0;
        for(int i=a; i<b; i++){
            if(CheckSpecialNum(i)) ans++;
        }
        System.out.println(ans);
        sc.close();
    }
    public static boolean CheckSpecialNum(int num){
        int minDiffS = Integer.MAX_VALUE;
        int minDiffN = Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).word == 'S') minDiffS = Math.min(minDiffS, Math.abs(arr.get(i).p-num));
            else if(arr.get(i).word == 'N')minDiffN = Math.min(minDiffN, Math.abs(arr.get(i).p-num));
        }

        if(minDiffS <= minDiffN) return true;
        return false;
    }
}