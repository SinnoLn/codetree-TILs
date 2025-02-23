import java.util.*;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] num = new int[n];
        int[] strike = new int[n];
        int[] ball = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                for(int k=1; k<10; k++){
                    if(i==j || j==k || k==i) continue;
                    if(Check_Num(i,j,k,num,strike,ball)) ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static boolean Check_Num(int a, int b, int c, int[] num, int[] strike, int[] ball){
        for(int i=0; i<n; i++){
            int[] tmp = new int[3];
            int[] tmp2= new int[3];
            int ba = 0;
            int s = 0;
            tmp[0] = num[i]/100;
            tmp[1] = (num[i]/10)%10;
            tmp[2] = num[i]%10;
            tmp2[0] = a;
            tmp2[1] = b;
            tmp2[2] = c;

            for(int j=0; j<3; j++){
                if(tmp[j] == tmp2[j]) s++;
            }
            if(s != strike[i]) return false;

            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(j!=k && tmp[j] == tmp2[k]){ 
                        ba++;
                        break;
                    }
                }
            }
            if(ball[i] != ba) return false;
        }
        return true;
    }
}