import java.util.*;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(F(0));
        sc.close();
    }
    public static int F(int index){
        if(index == arr.length-1) return arr[index];
        return LCM(arr[index], F(index+1));
    }
    public static int LCM(int a, int b){
        return(a*b)/GCD(a,b);
    }
    public static int GCD(int a, int b){
        while(b !=0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
}