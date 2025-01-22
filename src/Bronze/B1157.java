package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine().toUpperCase();
		int arr[] = new int[26];
		int maxValue = 0;
		int maxIndex = 0;
		boolean flag = true;
		
		for(int i=0;i<S.length();i++) {
			arr[S.charAt(i)-'A']++;
		}
		for(int i=0;i<arr.length;i++) {
			int compare = arr[i] - maxValue;
			if(compare>0) {
				maxValue = arr[i];
				flag = false;
				maxIndex = i;
			}else if(compare == 0) {
				flag = true;
			}
		}
		if(flag) System.out.println("?");
		else System.out.println((char)(maxIndex + 'A'));
	}
}
