package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String st = br.readLine();
			System.out.print(st.charAt(0));
			System.out.println(st.charAt(st.length()-1));
		}
		br.close();
		
		

	}

}
