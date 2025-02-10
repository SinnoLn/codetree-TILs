import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        int offset = 1000;
        int[][] rec = new int[2000][2000];

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        for(int h=x1; h<x2; h++){
            for(int w=y1; w<y2; w++){
                rec[h+offset][w+offset]++;
            }
        }

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        for(int h=x1; h<x2; h++){
            for(int w=y1; w<y2; w++){
                rec[h+offset][w+offset]=0;
            }
        }
        
        int cnt=0;
        int maxH = -1;
        int maxW = -1;
        int minH = 2000;
        int minW = 2000;

        boolean found = false;
        for(int i=0; i<2000; i++){
            for(int j=0; j<2000; j++){
                if(rec[i][j]==1){
                    found = true;
                    if(maxH<i) maxH = i;
                    if(maxW<j) maxW = j;
                    if(minH>i) minH = i;
                    if(minW>j) minW = j;
                }
            }
        }

        int area = 0;
        if(found) area = (maxH-minH+1)*(maxW-minW+1);
        else area = 0;
        
        System.out.println(area);
        sc.close();
    }
}