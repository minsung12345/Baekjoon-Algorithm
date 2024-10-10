import java.util.Scanner;

public class M14916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = N;
		int cntFive = 0;
		int cntTwo = 0;

		cntFive += N / 5;
		N = N % 5;
		while (N > 0) {

			if (N % 2 == 0) {
				cntTwo += N / 2;
				N = N%2;
			}else if(M<=N) {
				System.out.println(-1);
				return;
			}
			else {
				cntFive--;
				N += 5;
			}
		}
		sc.close();
		System.out.println(cntFive+cntTwo);
	}

}
