import java.util.*;

class Number{
    int index;
    int num;

    public Number(int index, int num){
        this.index = index;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Number[] number = new Number[n];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            number[i] = new Number(i+1, num);
        }

        Arrays.sort(number, (a,b)->a.num-b.num);

        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[number[i].index-1] = i+1;

        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
        
    }
}