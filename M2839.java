import java.util.Scanner;

public class M2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		// 5로 나눠떨어지지 않으면 3으로 나눈다
		while(N>0) {
			if(N%5 ==0) {
				count += N/5;
				System.out.println(count);
				return;
			}
			N -=3;
			count++;
		}
		
		System.out.println(N < 0 ? -1 : count);
	}

}
