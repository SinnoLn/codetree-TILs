import java.util.*;

class Record {
    int student;
    int charge;

    public Record(int student, int charge){
        this.student = student;
        this.charge = charge;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int MaxBudget = sc.nextInt();

        Record[] record = new Record[n];
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            record[i] = new Record(s, c);
        }

        Arrays.sort(record, (a,b) -> Integer.compare((a.student)/2 + a.charge, (b.student)/2 + b.charge));

        int ans = 0;
        for(int i=0; i<n; i++) {
            int tmp = 0;
            int count = 0;
            record[i].student/=2;
            for(int j=0; j<n; j++){
                if(tmp+record[j].student+record[j].charge > MaxBudget) break;
                tmp+=record[j].student+record[j].charge;
                count++;
            }
            record[i].student*=2;
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
        sc.close();
    }
}