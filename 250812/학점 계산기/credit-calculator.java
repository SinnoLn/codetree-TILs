import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double totalGrade = 0.0;
        for (int i = 0; i < n; i++) {
            totalGrade += Double.parseDouble(st.nextToken());
        }

        double average = totalGrade / n;

        // 반올림하여 소수 첫째 자리까지 출력
        System.out.printf("%.1f\n", average);

        if (average >= 4.0) {
            System.out.println("Perfect");
        } else if (average >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}