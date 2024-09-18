package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M14469 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());

        int[][] T = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            T[i][0] = Integer.parseInt(st.nextToken()); // 도착 시간
            T[i][1] = Integer.parseInt(st.nextToken()); // 검사 시간
        }

        Arrays.sort(T, (a, b) -> Integer.compare(a[0], b[0]));

        int sec = 0; // 총 소요 시간

        for (int i = 0; i < N; i++) {
            if (sec < T[i][0]) {
                sec = T[i][0];
            }
            sec += T[i][1];
        }

        System.out.println(sec);
    }
}
