import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M1449 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int W[] = new int[N];
		for(int i=0;i<N;i++) {
			W[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(W);
		
		int tapeCnt = 0;
		double coverEnd =0;
	
		for(int i=0;i<N;i++) {
		if(W[i] > coverEnd) {
			tapeCnt++;
			coverEnd = W[i] - 0.5 + L;
		}
		
		}
		System.out.println(tapeCnt);
	}

}
