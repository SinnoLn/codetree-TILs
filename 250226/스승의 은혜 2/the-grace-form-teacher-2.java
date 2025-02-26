import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxBuget = sc.nextInt();

        int[] gift = new int[n];
        for(int i=0; i<n; i++) gift[i] = sc.nextInt();
        Arrays.sort(gift);

        //그냥 완탐으로 품
        int maxNum = 0;
        for(int i=0; i<n; i++){
            int tmp = 0;
            int count = 0;
            for(int j=0; j<n; j++){
                if(tmp>maxBuget) break;
                if(i == j) tmp+=gift[j]/2;
                tmp += gift[j];
                count++;
            }
            maxNum = Math.max(maxNum, count);
        }
        System.out.println(maxNum);
        sc.close();
    }
}