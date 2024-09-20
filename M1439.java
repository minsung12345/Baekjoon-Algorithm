import java.util.Scanner;

public class M1439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
//		System.out.println(N.length()); N의 길이 : 7
		char num0 =0;
		char num1 = 1;
		int cnt0 = 0;
		int cnt1 = 0;
		
		if(N.charAt(0)=='0') {
			cnt0++;
		}else{
			cnt1++;
		}
		
		
		
		for(int i=1; i<N.length();i++) {
			if(N.charAt(i) != N.charAt(i-1)) {
				if(N.charAt(i) == '0') {
					cnt0++;
				}else{
					cnt1++;
				}
			}
		}
		System.out.println(Math.min(cnt0, cnt1));
	}

}
