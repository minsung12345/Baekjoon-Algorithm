package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class M2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		while(queue.size()>1) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
		
		
		
	}
}
