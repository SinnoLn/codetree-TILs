import java.util.*;

class Spot implements Comparable<Spot>{
    int x, y;
    int number;

    public Spot(int x, int y, int number){
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Spot spot){
        int dis1 = Math.abs(this.x) + Math.abs(this.y);
        int dis2 = Math.abs(spot.x) + Math.abs(spot.y);

        if(dis1 == dis2) return this.number - spot.number;
        return dis1 - dis2;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Spot[] spot = new Spot[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            spot[i] = new Spot(x,y,i+1);
        }
        Arrays.sort(spot);

        for(Spot s : spot){
            System.out.println(s.number);
        }
        sc.close();
    }
}