import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        for(int i=0; i<a; i++) arr1[i] = sc.nextInt();
        for(int i=0; i<b; i++) arr2[i] = sc.nextInt();

        if(isSubsequence(arr1,arr2)) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }

    public static boolean isSubsequence(int arr1[], int arr2[]){
        for(int i=0; i<=arr1.length-arr2.length; i++){
            boolean check = true;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i+j] != arr2[j]) {
                    check = false;
                    break;
                }
            }
            if(check == true) return true;
        }
        return false;
    }
}