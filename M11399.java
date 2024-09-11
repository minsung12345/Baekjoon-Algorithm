import java.util.Arrays;
import java.util.Scanner;

public class M11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int M[] = new int[N];
		for(int i=0;i<N;i++) {
			M[i] = sc.nextInt();
		}
		Arrays.sort(M);
		int sum = 0;
		int j = 0;
		for(int i=0;i<N;i++) {
			j += M[i];
			sum += j;
		}
		System.out.println(sum);
	}

}
