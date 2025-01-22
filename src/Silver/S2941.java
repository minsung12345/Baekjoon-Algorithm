package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String cro[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt = 0;
		for(int i=0;i<S.length();i++) {
			for(String pattern:cro) {
				if(i+pattern.length() <= S.length()
						&& S.substring(i,i+pattern.length()).equals(pattern)) {
					i += pattern.length()-1;
					break;
					
				}
			}
			cnt++;
			
		}
		System.out.println(cnt);
	}

}
