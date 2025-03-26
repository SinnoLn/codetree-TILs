import java.util.*;
import java.io.*;
//g만
//h만
//g와 h 반반
//0부터 100
//사진거리: 양쪽 끝에 있는 사람 간의 거리
class Record {
    int position;
    char color;

    public Record(int position, char color){
        this.position = position;
        this.color = color;
    }
};

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Record record[] = new Record[n];
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int position = Integer.parseInt(input[0]);
            char c = input[1].charAt(0);

            record[i] = new Record(position, c);
        }
        //정렬 해줘야함!!!!!
        Arrays.sort(record, (a,b) -> a.position-b.position);

        int ans = 0;
        for(int i=0; i<record.length; i++){
            for(int j=i+1; j<record.length; j++){
                int gCount = 0;
                int hCount = 0;

                for(int k=i; k<j+1; k++){
                    if(record[k].color == 'G') gCount++;
                    else if(record[k].color == 'H') hCount++;
                }
                if((gCount == hCount && gCount != 0) || (gCount == 0 && hCount != 0) || (hCount == 0 && gCount != 0)){
                    ans = Math.max(ans, (record[j].position - record[i].position));
                }
            }
        }
        System.out.println(ans);
    }
}