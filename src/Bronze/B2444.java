package Bronze;

import java.util.Scanner;

public class B2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("*");
			}
			for(int l=i;l>0;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<N;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<N;k++) {
				System.out.print("*");
			}
			for(int l=i;l<N-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
				

	}

}
