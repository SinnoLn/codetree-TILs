import java.util.*;
import java.io.*;

//n*n 크기의 격자판 (중앙에 술래)
//m명의 도망자 (유형1: 좌우 이동(오른쪽방향), 유형2: 위 아래 이동(아래방향))
//중앙에 존재는 불가
//h: 나무 개수(초기 좌표 도망자와 겹치기 가능)

//k번 반복
//도망자 움직임(술래와 거리가 3이하인 도망자만)
//술래 움직임
//두 사람간의 거리 |x1-x2| + |y1-y2|

//도망자의 움직임 규칙
//현재 바라보고 있는 칸으로 1칸움직인다고 했을때 격자 안벗어나는 경우
//움직이려는데 술래 있음 못움직임
//술래 없음 해당칸 이동. 나무있어도 이동

//현재 바라보고 있는 칸으로 1칸움직인다고 했을때 격자 벗어나는 경우
//반대로 방향 틀기
//1칸 움직일때 술재 없다면 1칸 앞으로 이동

//술래의 움직임 규칙
//중앙에서 위 방향보고 달팽이 모양으로 움직임
//끝으로 도달시 다시 거꾸로 중심으로 이동 (k턴에 걸쳐 반복)
//방향을 도는데 걸리는 시간은 없음 바로 돔

//술래는 턴을 넘기기 전 시야에 있는 도망자를 잡게 됨
//시야는 현재 바라보고 있는 방향을 기준 현재 칸을 포함하여 총 3칸
//격자 크기는 상관 없음

//근데 도망자랑 나무 같이있으면 안보임 (안잡음)
//t턴에서 t*(현재 잡힌 도망자 수만큼 포인트)
//도망자 사라짐

//5 <= n <= 99 (n은 반드시 홀수)
//1 <=m,h<=n^2
//1<=k<=100
//1<=x,y<=n

//설계
//n*n사이즈의 이차원 판 (나무는 여기에 설치) (나무: 2)
//술래 좌표 저장
//도망자 좌표 list로 저장? 겹쳐도 상관없음 방향이 다름
//유형 2개의 도망자 , 방향은 (-1 곱하는걸로)

//k번 반복
//먼저 거리가 3이하인 도망자 이동
//술래 이동
public class Main {
    public static int n,m,h,k;
    public static int[][] area;
    public static int[] tagger;
    public static int[][] runner;
    // 상, 우, 하, 좌 (↑ → ↓ ←)
    public static int[] dy = {-1, 0, 1, 0};
    public static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOExecption{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        area = new int[n][n];
        runner = new int[m][4];
        tagger = new int[2];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            runner[i][0] = Integer.parseInt(st.nextToken()); //행
            runner[i][1] = Integer.parseInt(st.nextToken()); //열
            runner[i][2] = Integer.parseInt(st.nextToken()); //유형

            if(runner[i][2] == 1) runner[i][3] = 1;
            else runner[1][3] = 2;
        }

        for(int i=0; i<h; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parse(st.nextToken());
        }

    }
}