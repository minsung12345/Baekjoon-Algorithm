package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = -1000001;
		int min = 1000000;
		while (st.hasMoreElements()) {
			int val = Integer.parseInt(st.nextToken());
			if(max < val) {
				max = val;
			}
			if(min > val) {
				min = val;
			}
		}
		System.out.println(min + " " + max);

	}

}
