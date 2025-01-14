package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		
		for(int i=0;i<9;i++) {
			int val = Integer.parseInt(br.readLine());
			
			if(max < val) {
				max = val;
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
