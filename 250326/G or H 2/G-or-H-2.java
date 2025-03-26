import java.util.*;
import java.io.*;
//g만
//h만
//g와 h 반반
//0부터 100
//사진거리: 양쪽 끝에 있는 사람 간의 거리
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] record = new char[101];
        int max_position = 0;
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int position = Integer.parseInt(input[0]);
            char c = input[1].charAt(0);
            max_position = Math.max(max_position, position);

            record[position] = c;
        }

        int ans = 0;
        //완전탐색 진행
        for(int i = 0; i<max_position+1; i++){
            for(int j = i+1; j<max_position+1; j++){
                if(record[i] != 'G' && record[i] != 'H') continue;
                if(record[j] != 'G' && record[j] != 'H') continue;

                int gCount = 0;
                int hCount = 0;
                for(int k=i; k<j+1; k++){
                    if(record[k] == 'G') gCount++;
                    else if(record[k] == 'H') hCount++;
                }
                if(gCount == hCount || gCount == 0 || hCount == 0){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        System.out.println(ans);
    }
}