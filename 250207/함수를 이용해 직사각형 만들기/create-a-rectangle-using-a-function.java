import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int arr = sc.nextInt();

        makeRectangle(col, arr);
        sc.close();
    }

    public static void makeRectangle(int col, int arr){
        for(int i=0; i<col; i++){
            for(int j=0; j<arr; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}