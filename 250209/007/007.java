import java.util.*;

class Secret{
    String code, location;
    int meetTime;

    public Secret(String code, String location, int meetTime){
        this.code = code;
        this.location = location;
        this.meetTime = meetTime;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String location = sc.next();
        int meetTime = sc.nextInt();

        Secret secret = new Secret(code, location, meetTime);

        System.out.println("secret code : " + secret.code);
        System.out.println("meeting point : " + secret.location);
        System.out.println("time : " + secret.meetTime);
        sc.close();
    }
}