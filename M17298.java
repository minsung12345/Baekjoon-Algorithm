package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class M17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//수열 배열
		int []A = new int[N];
		//정답 배열
		int []B = new int[N];
		String []str = br.readLine().split(" ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		for(int i =1;i<N;i++) {
			while(!stack.isEmpty() && A[stack.peek()]<A[i]) {
				B[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while (!stack.empty()) {
			B[stack.pop()]=-1;
		}
		
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			for(int i=0;i<N;i++) {
				bw.write(B[i]+" ");
			}
			bw.write("\n");
			bw.flush();
			
				
	}

}
