import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i : arr2) System.out.print(i + " ");
        sc.close();
    }
}