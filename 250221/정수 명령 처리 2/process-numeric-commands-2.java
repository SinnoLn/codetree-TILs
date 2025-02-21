import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String s = sc.next();
            if(s.equals("push")){
                int num = sc.nextInt();
                q.add(num);
            }
            else if(s.equals("front")) System.out.println(q.peek());
            else if(s.equals("size")) System.out.println(q.size());
            else if(s.equals("empty")) {
                if(q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else System.out.println(q.poll());
        }
        sc.close();
    }
}