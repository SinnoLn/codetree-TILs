import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num == 1){
                int first = sc.nextInt();
                int second = sc.nextInt();

                char a = s.charAt(first-1);
                char b = s.charAt(second-1);

                char arr[] = s.toCharArray();
                arr[first-1] = b;
                arr[second-1] = a;

                s= String.valueOf(arr);
                System.out.println(s); 
            }
            else if(num ==2){
                String a = sc.next();
                String b = sc.next();

                char arr[] = s.toCharArray();
                for(int j=0; j<arr.length; j++){
                    if(arr[j] == a.charAt(0)) arr[j] = b.charAt(0);
                }
                s= String.valueOf(arr);
                System.out.println(s);
            }
        }
        sc.close();
    }
}