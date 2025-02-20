import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int maxVal = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(checkCarry(arr[i], arr[j], arr[k])) maxVal = Math.max(maxVal, arr[i] + arr[j] + arr[k]);
                }
            }
        }
        if(maxVal==0)maxVal = -1;
        System.out.println(maxVal);
        sc.close();
    }

    public static boolean checkCarry(int a, int b, int c){
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        String sc = Integer.toString(c);

        int maxLen = Math.max(sa.length(), Math.max(sb.length(),sc.length()));
        while(sa.length()<maxLen) sa = "0" + sa;
        while(sb.length()<maxLen) sb = "0" + sb;
        while(sc.length()<maxLen) sc = "0" + sc;

        for(int t=0; t<maxLen; t++){
            int tmp = sa.charAt(t)-'0' + sb.charAt(t)-'0' + sc.charAt(t)-'0';
            if(tmp>9) return false;
        }
        return true;
    }
}