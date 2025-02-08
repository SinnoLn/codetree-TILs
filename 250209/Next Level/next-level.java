import java.util.*;

class User{
    String id;
    int level;
    
    public User(){
        this.id = "codetree";
        this.level = 10;
    }
    
    public User(String id, int level){
        this.id = id;
        this.level = level;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("user "+user.id+" lv " + user.level);
        
        user.id = sc.next();
        user.level = sc.nextInt();
        System.out.println("user "+user.id+" lv " + user.level);
        sc.close();
    }
}