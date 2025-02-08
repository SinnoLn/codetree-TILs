import java.util.*;

class Agent{
    String codeName;
    int score;

    public Agent(){
        this.codeName = "";
        this.score = 0;
    }

    public Agent(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agent = new Agent[5];
        int minValIndex = 0;

        for(int i=0; i<5; i++){
            String codeName = sc.next();
            int score = sc.nextInt();
            agent[i] = new Agent(codeName, score);
            if(agent[minValIndex].score > score) minValIndex = i; 
        }

        System.out.println(agent[minValIndex].codeName + " " + agent[minValIndex].score);

        sc.close();
    }
}