import java.util.*;

class Bomb{
    String code;
    char color;
    int time;

    public Bomb(){
        this.code = "";
        this.color = '-';
        this.time = 0;
    }

    public Bomb(String code, char color, int time){
        this.code = code;
        this.color = color;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        char color = sc.next().charAt(0);
        int time = sc.nextInt();

        Bomb bomb = new Bomb(code, color, time);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.time);
        sc.close();
    }
}