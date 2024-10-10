import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class M1138 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			M[i] = Integer.parseInt(st.nextToken());
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=N;i>0;i--) {
			int cnt = M[i-1];
			result.add(cnt,i);
		}
		for (Integer num : result) {
			System.out.print(num+" ");
		}
	}

}
