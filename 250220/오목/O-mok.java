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
        System.out.println(checkWinner());
        System.out.println(num[0] + " " + num[1]);
        sc.close();
    }

    public static int checkWinner(){
        //가로로 우승
        for(int i=0; i<19; i++){
            for(int j=0; j<19-4; j++){
                if(arr[i][j] != 0 && arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2] && arr[i][j+2] == arr[i][j+3] && arr[i][j+3]== arr[i][j+4]) {
                    num[0] = i+1;
                    num[1] = j+1+2;
                    return arr[i][j];
                }
            }
        }

         //세로로 우승
        for(int i=0; i<19-4; i++){
            for(int j=0; j<19; j++){
                if(arr[j][i] != 0 && arr[j][i] == arr[j+1][i] && arr[j+1][i] == arr[j+2][i] && arr[j+2][i] == arr[j+3][i] && arr[j+3][i]== arr[j+4][i]){
                    num[0] = i+1+2;
                    num[1] = j+1;
                    return arr[i][j];
                }
            }
        }

         //대각선 우승
        for(int i=0; i<19-4; i++){
            for(int j=0; j<19-4; j++){
                if(arr[j][i] != 0 && arr[j][i] == arr[j+1][i+1] && arr[j+1][i+1] == arr[j+2][i+2] && arr[j+2][i+2]== arr[j+3][i+3] && arr[j+3][i+3] == arr[j+4][i+4]){
                    num[0] = i+1+2;
                    num[1] = j+1+2;
                    return arr[i][j];
                } 
            }
        }
        return 0;
    }
}