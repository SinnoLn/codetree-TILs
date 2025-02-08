import java.util.*;

class Location{
    String name;
    String streetNumber; 
    String region;

    public Location(){
        this.name = "";
        this.streetNumber = "";
        this.region = "";
    }
    public Location(String name, String streetNumber, String region){
        this.name = name;
        this.streetNumber = streetNumber;
        this.region = region;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Location[] location = new Location[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            String streetNumber = sc.next();
            String region = sc.next();

            location[i] = new Location(name, streetNumber, region);
        }

        Arrays.sort(location, Comparator.comparing(l -> l.name));

        System.out.println("name " + location[n-1].name);
        System.out.println("addr " + location[n-1].streetNumber);
        System.out.println("city " + location[n-1].region);
        
    }
    
}