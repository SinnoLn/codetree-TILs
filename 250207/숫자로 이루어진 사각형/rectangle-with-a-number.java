import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        makeRectangle(n);
        sc.close();
    }

    public static void makeRectangle(int n){
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(num+" ");
                num++;
                if(num>9) num=1;
            }
            System.out.println();
        }
    }
}