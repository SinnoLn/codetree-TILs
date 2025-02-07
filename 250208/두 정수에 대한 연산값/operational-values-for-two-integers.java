import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1];
        int[] b = new int[1];

        a[0] = sc.nextInt();
        b[0] = sc.nextInt();

        cal(a, b);
        System.out.println(a[0] + " " + b[0]);
        sc.close();
    }
    public static void cal(int[] a, int[] b){
        if(a[0]<b[0]){
            b[0]+=25;
            a[0]*=2;
        } 
        else{
            a[0]+=25;
            b[0]*=2;
        }  
    }
}