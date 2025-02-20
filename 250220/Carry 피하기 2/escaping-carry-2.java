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
                    int len = Math.min(Integer.toString(arr[i]).length(),Math.min(Integer.toString(arr[j]).length(),Integer.toString(arr[k]).length()));
                    int mlen = Math.max(Integer.toString(arr[i]).length(),Math.max(Integer.toString(arr[j]).length(),Integer.toString(arr[k]).length()));
                    String s1 = new StringBuilder(Integer.toString(arr[i])).reverse().toString();
                    String s2 = new StringBuilder(Integer.toString(arr[j])).reverse().toString();
                    String s3 = new StringBuilder(Integer.toString(arr[k])).reverse().toString();
                    int sum = arr[i] + arr[j] + arr[k];
                    boolean check = true;
                    if(Integer.toString(sum).length()>mlen) check = false;
                    for(int t=0; t<len; t++){
                        if(s1.charAt(t)-'0'+s2.charAt(t)-'0'+s3.charAt(t)-'0' > 9){
                            check = false;
                            break;
                        } 
                    }
                    if(check) maxVal = Math.max(maxVal,sum);
                }
            }
        }
        if(maxVal==0)maxVal = -1;
        System.out.println(maxVal);
        sc.close();
    }
}