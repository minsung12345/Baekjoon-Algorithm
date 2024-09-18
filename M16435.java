package Test;

import java.util.Arrays;
import java.util.Scanner;

public class M16435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int F[] = new int[N]; 
		for(int i=0; i<N;i++) {
			F[i] = sc.nextInt();
		}
		
		Arrays.sort(F);
		
		for(int i=0; i<N;i++) {
			if(M >= F[i]) {
				M++;
			}
			
		}
		System.out.println(M);
		
		sc.close();
	}

}
