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
            gift[i]/=2;
            for(int j=0; j<n; j++){
                if(tmp + gift[j] > maxBuget) break;
                tmp += gift[j];
                count++;
            }
            gift[i]*=2;
            maxNum = Math.max(count, maxNum);
        }
        System.out.println(maxNum);
        sc.close();
    }
}