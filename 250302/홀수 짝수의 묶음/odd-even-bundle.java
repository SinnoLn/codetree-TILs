import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num%2==0) evenSum++;
            else oddSum++;
        }

        int ans = 0;
        if(oddSum == 0) ans = 1;
        else if(evenSum == 0){
            if(oddSum%3 == 0 || oddSum%3 == 2) ans = Allodd(oddSum);
            else {
                while(oddSum%3 != 0 && oddSum%3 != 2) oddSum-=2;
                ans = Allodd(oddSum);
            }
        } 
        else{
            if(oddSum>evenSum){
                ans+=evenSum*2;
                oddSum-=evenSum;
                if(oddSum%3 == 0 || oddSum%3 == 2) ans += Allodd(oddSum);
                else {
                    while(oddSum%3 != 0 && oddSum%3 != 2) oddSum-=2;
                    ans += Allodd(oddSum);
                }   
            }
            else if(oddSum == evenSum) ans = (oddSum+evenSum);
            else{
                if((evenSum-1) == oddSum) ans = evenSum+oddSum;
                else ans = 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
    public static int Allodd(int n){
    if(n%3 == 0) return (n/3)*2;
    else if(n%3 == 2) return (n/3)*2+1;
    else return 0;
    }
}