import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push")){
                int num = sc.nextInt();
                pq.add(-num);
            }
            else if(op.equals("size")) System.out.println(pq.size());
            else if(op.equals("empty")){
                if(pq.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if(op.equals("pop")) System.out.println(-pq.poll());
            else System.out.println(-pq.peek());
        }
        sc.close();
    }
}