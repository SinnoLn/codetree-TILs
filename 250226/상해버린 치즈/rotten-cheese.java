import java.util.*;

class Record {
    int people;
    int cheese;
    int time;

    public Record(int people, int cheese, int time){
        this.people = people;
        this.cheese = cheese;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //완전탐색이라는건 알겠음
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();

        //치즈는 먹고 1초후에 아픔
        Record[] record = new Record[d];

        for(int i=0; i<d; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();
            int t = sc.nextInt();

            record[i] = new Record(p,c,t);
        }

        Arrays.sort(record, (a, b) -> Integer.compare(a.time, b.time));

        int[][] sickPeople = new int[s][2];
        for(int i=0; i<s; i++){
            sickPeople[i][0] = sc.nextInt();
            sickPeople[i][1] = sc.nextInt();
            boolean ateBeforeSick = false;
        }

        int ans = 0;
        for(int i=0; i<m; i++){ //m번 치츠가 썩은치즈라면
            int count = 0;
            for(int k=0; k<s; k++){ 
                int sickPerson = sickPeople[k][0]; // 아픈사람
                int sickTime = sickPeople[k][1]; // 아픈 시간
                boolean ateBeforeSick = false;

                //한사람이 여러번 먹을수 있음. 어느 치즈를 먹고 아픈지도 확인해야함
                for(int j=0; j<d; j++){  //총 먹은 사람
                    if((record[j].cheese == (i+1)) && (record[j].people == sickPerson)){ // 아픈사람이 먹었나 확인
                        if(record[j].time < sickTime) ateBeforeSick = true;
                        continue;
                    }
                }
                if(!ateBeforeSick) continue;
            }

            int[] check = new int[n];
            count = 0;
            for(int j=0; j<d; j++) {
                if(record[j].cheese == (i+1)){
                    check[record[j].people-1]++;
                } 
            }
            for(int j=0; j<n; j++){
                if(check[j]>0) count++;
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
        sc.close();
    }
}