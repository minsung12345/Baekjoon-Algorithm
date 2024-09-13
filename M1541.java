import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String []sub =input.split("-");
		
		int result = sum(sub[0]); 
		
		for(int i = 1; i<sub.length;i++) {
			result -= sum(sub[i]);
		}
		
		System.out.println(result);
	}

	private static int sum(String part) {
		String[] additionParts = part.split("\\+");
		int sum = 0;
		for(String num : additionParts) {
			sum += Integer.valueOf(sum);
		}
		return sum;
	}

}
