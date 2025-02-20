import java.util.*;

public class Main {
    public static int[][] arr = new int[19][19];
    public static int[] num = new int[2];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int winner = checkWinner();
        if(winner != 0){
            System.out.println(winner);
            System.out.println(num[0] + " " + num[1]);
        } 
        else System.out.println(0);
        sc.close();
    }

    public static int checkWinner(){
        int dx[] = {1,0,1,1};
        int dy[] = {0,1,1,-1};

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                if(arr[i][j]==0) continue;
                int stone = arr[i][j];

                for(int d=0; d<4; d++){
                    int ny = i;
                    int nx = j;
                    int count = 1;

                    while(true){
                        ny+=dy[d];
                        nx+=dx[d];

                        if(ny<0 || nx<0 || ny>=19 || nx>=19) break;
                        if(arr[ny][nx] != stone) break;
                        count++;
                    }

                    if(count == 5){
                        num[0] = i+dy[d]*2+1;
                        num[1] = j+dx[d]*2+1;
                        return stone;
                    }
                }
            }
        }
        return 0;
    }
}