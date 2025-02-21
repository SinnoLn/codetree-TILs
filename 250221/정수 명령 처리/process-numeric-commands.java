import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String s = sc.next();

            if(s.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }
            else if(s.equals("top")) System.out.println(stack.peek());
            else if(s.equals("size")) System.out.println(stack.size());
            else if(s.equals("empty")){
                if(stack.empty()) System.out.println(1);
                else System.out.println(0);
            }
            else System.out.println(stack.pop());
        }
        sc.close();
    }
}