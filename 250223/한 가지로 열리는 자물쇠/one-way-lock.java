import java.util.*;

//2 이내면 열림
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;
        for(int i=1; i<n+1; i++){
            for(int k=1; k<n+1; k++){
                for(int j=1; j<n+1; j++){
                    if(Math.abs(i-a)>2 &&Math.abs(k-b)>2 &&Math.abs(j-c)>2) continue;
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}