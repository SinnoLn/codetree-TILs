import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        String s = sc.next();
        boolean check = true;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '(') stack.push(1);
            else if(c == ')'){
                if(stack.empty()) {
                    check = false;
                    break;
                } 
                stack.pop();
            }
        }
        if(!stack.empty()) check = false;

        if(check) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}