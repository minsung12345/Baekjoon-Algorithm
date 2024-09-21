import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M20044 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int []proj = new int[N*2];
		
		for(int i =0;i<N*2;i++) {
			proj[i] =  Integer.parseInt(st.nextToken());
		}
		Arrays.sort(proj);
		
		int j = (N*2)-1;
		int min = proj[0]+proj[j];
		for(int i=0;i<N;i++) {
			if(min>proj[i]+proj[j]) {
				min =proj[i]+proj[j];
			}
			j--;
		}
		System.out.println(min);
	}

}
