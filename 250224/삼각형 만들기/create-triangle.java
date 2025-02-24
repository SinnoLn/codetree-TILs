import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int offset = 10000;
        int ans = 0;

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt()+offset;
            arr[i][1] = sc.nextInt()+offset;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i==j || j==k | k==i) continue;
                    //x축 평행 확인
                    if(arr[i][1] != arr[j][1] && arr[j][1] != arr[k][1] && arr[k][1] != arr[i][1]) continue;
                    //y축 평행 확인
                    if(arr[i][0] != arr[j][0] && arr[j][0] != arr[k][0] && arr[k][0] != arr[i][0]) continue;

                    int l1 = Math.abs(arr[i][1] - arr[j][1])*Math.abs(arr[i][1] - arr[j][1]) + Math.abs(arr[i][0] - arr[j][0])*Math.abs(arr[i][0] - arr[j][0]);
                    int l2 = Math.abs(arr[j][1] - arr[k][1])*Math.abs(arr[j][1] - arr[k][1]) + Math.abs(arr[j][0] - arr[k][0])*Math.abs(arr[j][0] - arr[k][0]);
                    int l3 = Math.abs(arr[k][1] - arr[i][1])*Math.abs(arr[k][1] - arr[i][1]) + Math.abs(arr[k][0] - arr[i][0])*Math.abs(arr[k][0] - arr[i][0]);

                    int area = 0;
                    if(l1 + l2 == l3) area = (int)(Math.sqrt(l1) * Math.sqrt(l2));
                    if(l2 + l3 == l1) area = (int)(Math.sqrt(l2) * Math.sqrt(l3));
                    if(l1 + l3 == l2) area = (int)(Math.sqrt(l1) * Math.sqrt(l3));

                    ans = Math.max(ans, area);
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}