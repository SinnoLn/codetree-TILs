import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] people = new int[n];
        for(int i=0; i<n; i++) people[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] check = new int[2];
        for(int i=0; i<2; i++) check[i] = Integer.parseInt(st.nextToken());
        long ans = 0;

        int lc = check[0];
        int ec = check[1];
        for(int i=0; i<n; i++){
            int p = people[i];
            p-=lc;
            if(p>0){
                ans+=(p/ec);
                if((p%ec) != 0) ans++;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
