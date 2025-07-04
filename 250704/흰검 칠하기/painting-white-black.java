import java.io.*;
import java.util.*;

//흰색, 검은색
//흰 -> 검, 검 -> 흰 => 회색으로 고정
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        final int MAX_RANGE = 200000 + 1;
        final int OFFSET = 100000;

        // 각 타일이 흰색으로 칠해진 횟수
        int[] whiteCounts = new int[MAX_RANGE * 2];
        // 각 타일이 검은색으로 칠해진 횟수
        int[] blackCounts = new int[MAX_RANGE * 2];
        // 각 타일의 최종 색깔: 0 (흰색), 1 (검은색), 2 (회색), -1 (아직 칠해지지 않음)
        int[] finalColors = new int[MAX_RANGE * 2];

        Arrays.fill(finalColors, -1);

        int currentPos = OFFSET;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            int lastPaintedIndex = -1;

            if (dir == 'R') {
                for (int j = 0; j < x; j++) {
                    int targetIndex = currentPos + j;

                    blackCounts[targetIndex]++;

                    if (whiteCounts[targetIndex] >= 1 && blackCounts[targetIndex] >= 1) { 
                        if (whiteCounts[targetIndex] >= 2 && blackCounts[targetIndex] >= 2) {
                             finalColors[targetIndex] = 2;
                        } else {
                             finalColors[targetIndex] = 1;
                        }
                    } else {
                        finalColors[targetIndex] = 1; 
                    }
                    lastPaintedIndex = targetIndex;
                }
            } else {
                for (int j = 0; j < x; j++) {
                    int targetIndex = currentPos - j;

                    whiteCounts[targetIndex]++;

                    if (whiteCounts[targetIndex] >= 1 && blackCounts[targetIndex] >= 1) {
                        if (whiteCounts[targetIndex] >= 2 && blackCounts[targetIndex] >= 2) {
                            finalColors[targetIndex] = 2;
                        } else {
                            finalColors[targetIndex] = 0;
                        }
                    } else {
                        finalColors[targetIndex] = 0;
                    }
                    lastPaintedIndex = targetIndex;
                }
            }
            currentPos = lastPaintedIndex;
        }

        int whiteCount = 0;
        int blackCount = 0;
        int grayCount = 0;

        for (int i = 0; i < finalColors.length; i++) {
            if (finalColors[i] == 0) {
                whiteCount++;
            } else if (finalColors[i] == 1) {
                blackCount++;
            } else if (finalColors[i] == 2) {
                grayCount++;
            }
        }

        System.out.println(whiteCount + " " + blackCount + " " + grayCount);
    }
}