import java.io.*;
import java.util.*;

//팀장 1
//팀원 0 ~ 이상
//식당의 수 n 1,000,000
//각 식당에 있는 고객 수 1,000,000
//검사팀장 검사가능한 최대 고객수, 검사팀원이 검사 가능한 최대 고객수  1,000,000
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] people = br.readLine().split(" ");
        String[] check = br.readLine().split(" ");
        int ans = 0;

        for(int i=0; i<n; i++){
            int p = Integer.parseInt(people[i]);
            int lc = Integer.parseInt(check[0]);
            int ec = Integer.parseInt(check[1]);

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