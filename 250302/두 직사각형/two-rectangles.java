import java.util.*;

class Rec{
    int x1, x2;
    int y1, y2;
    public Rec(int x1,  int x2, int y1, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rec[] rec = new Rec[2];
        for(int i=0; i<2; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            rec[i] = new Rec(x1, y1, x2, y2);
        }

        if(CheckRec(rec)) System.out.println("overlapping");
        else System.out.println("nonoverlapping");
        
        sc.close();
    }

    public static boolean CheckRec(Rec[] rec){
        if(rec[0].x2 < rec[1].x1 || rec[1].x2 < rec[0].x1 || rec[0].y2 < rec[1].y1 || rec[1].y2 < rec[0].y1) return false;
        return true;
    }
}