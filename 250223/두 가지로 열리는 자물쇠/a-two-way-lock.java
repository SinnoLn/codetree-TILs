import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[3];
        int b[] = new int[3];

        for(int i=0; i<3; i++) a[i] = sc.nextInt();
        for(int i=0; i<3; i++) b[i] = sc.nextInt();

        int ans = 0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                for(int k=1; k<n+1; k++){
                    if(Check_Num(i,j,k,n,a) || Check_Num(i,j,k,n,b)) ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
    public static boolean Check_Num(int a, int b, int c, int n, int[] tmp){
        if(Math.abs(tmp[0]-a)>2 && n-Math.abs(tmp[0]-a)>2) return false;
        if(Math.abs(tmp[1]-b)>2 && n-Math.abs(tmp[1]-b)>2) return false;
        if(Math.abs(tmp[2]-c)>2 && n-Math.abs(tmp[2]-c)>2) return false;
        return true;
    }
}