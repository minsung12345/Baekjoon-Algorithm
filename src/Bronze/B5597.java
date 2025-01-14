package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[10];
		int count = 0;
		
		for(int i=0;i<10;i++) {
			int val = Integer.parseInt(br.readLine());
			num[i] = val % 42;
		}
		for(int i=0;i<10;i++) {
			int tmp = 0;
			for(int j=i+1;j<10;j++) {
				if(num[i] == num[j]) {
					tmp++;
				}
			}
			if(tmp == 0) {
				count++;
			}
			
		}
		System.out.println(count);
		br.close();
	}

}
