import java.util.*;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);

        swap(n,m);
        System.out.print(n.value + " " + m.value);    
        sc.close();
    }
    public static void swap(IntWrapper n, IntWrapper m){
        int tmp = n.value;
        n.value = m.value;
        m.value = tmp;
    }
}