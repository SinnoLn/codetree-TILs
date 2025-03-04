import java.util.*;

public class Main {
    public static int n;
    public static int k;
    public static int[][] arr = new int[n][n];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int startY = sc.nextInt();
        int startX = sc.nextint();

        while(k--){
            if(!CanGo(startY, startX)) break;
            CheckMaxNum(startY, startX);
        }
        System.out.println((startY+1) + " " + (startX + 1));
        sc.close();
    }
    public static boolean CanGo(int y, int x){
        int[] dy = {0,0,1,-1};
        int[] dx = {1,-1,0,0};
        int check = false;

        for(int i=0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
            if(arr[y][x] > arr[ny][nx]) check = true;
        }
        return check;
    }
    public static void CheckMaxNum(int y, int x){
        int maxNum = -1;
        int tmpy = -1;
        int tmpx = -1;

        for(int i=0; i<n; i++){
            for(int j-0; j<n; j++){
                if(y == i && x == j) continue;
                if(arr[i][j] >= arr[y][x]) continue;
                if(maxNum < arr[i][j]){
                    maxNum = arr[i][j];
                    tmpy = i;
                    tmpx = j
                }
                else if(maxNum == arr[i][j]){
                    if(i < y){
                        tmpy = i;
                        tmpx = j;
                    }
                    else if(j < x){
                        tmpy = i;
                        tmpx = j;
                    }
                }
            }
        }
        startY = tmpy;
        startX = tmpy;
    }
}