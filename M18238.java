import java.util.Scanner;

public class M18238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int tot = 0;
		char current = 'A';
		for(int i=0 ;i<N.length();i++) {
			char M =N.charAt(i);
			int dis= Math.abs(current - M);
			int dis2 = 26-dis;
			tot += Math.min(dis,dis2);
			current = M;
		}
		System.out.println(tot);
	}

}
