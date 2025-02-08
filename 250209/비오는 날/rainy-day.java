import java.util.*;

class Weather{
    String date;
    String day;
    String info;

    public Weather(){
        this.date = "";
        this.day = "";
        this.info = "";    
    }

    public Weather(String date, String day, String info){
        this.date = date;
        this.day = day;
        this.info = info;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Weather[] weather = new Weather[n];
        for(int i=0; i<n; i++){
            String date = sc.next();
            String day = sc.next();
            String info = sc.next();
            
            weather[i] = new Weather(date, day, info);
        }
        Arrays.sort(weather, Comparator.comparing(l->l.date));

        for(Weather w : weather){
            if(w.info.equals("Rain")){
                System.out.println(w.date +" "+w.day+" "+w.info);
                break;
            }
        }
        sc.close();
    }
}