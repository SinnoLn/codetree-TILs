import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<6; i++){
            int n = sc.nextInt();
            list.add(n);
        }

        Collections.sort(list);
        int team1 = list.get(5) + list.get(0);
        int team2 = list.get(3) + list.get(2);
        int team3 = list.get(4) + list.get(1);

        int max = Math.max(team1, Math.max(team2,team3));
        int min = Math.min(team1, Math.min(team2,team3));

        System.out.println(max - min);
        sc.close();
    }
}