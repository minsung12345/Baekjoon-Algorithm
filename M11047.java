import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		int coins[] = new int[N];
		for(int i=0;i<N;i++) {
		st= new StringTokenizer(br.readLine());
		coins[i] = Integer.valueOf( st.nextToken());
		}
		int i = N-1;
		int cnt = 0;
		while(K>0) {
			if(coins[i]<=K) {
				cnt += K/coins[i];
				K %= coins[i];
				
			}else {
				i--;
			}
		}
		System.out.println(cnt);
	}

}
