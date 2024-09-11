import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class M1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int []arr1 = new int[N];
		Integer []arr2 = new Integer[N];
		
		for(int i =0 ;i<N;i++) {
			arr1[i] = Integer.valueOf( st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		for(int i =0 ;i<N;i++) {
			arr2[i] = Integer.valueOf(st.nextToken());
		}
	
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		
		int result = 0;
		
		for(int i =0;i<N;i++) {
			result += arr1[i] * arr2[i];
		}
		System.out.println(result);
	}

}
