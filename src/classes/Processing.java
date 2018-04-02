package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Processing {
	private static Queue<Integer> inputQueue = new LinkedList();
	private static Queue<Integer> processingQueue = new LinkedList();
	private static ArrayList<Integer> terminatedJobs = new ArrayList<>();
	private static int time;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of jobs: ");
		int n = sc.nextInt();
		for (int i = 0; i < n*2; i++) {
			inputQueue.add(sc.nextInt());
			inputQueue.add(sc.nextInt());
		}
		System.out.println(inputQueue);
		time=0;
		
		while(!inputQueue.isEmpty() || !processingQueue.isEmpty()){
			if(!processingQueue.isEmpty()){
				for (int i = 0; i < processingQueue.size()-1; i++) {
					
				}
			}
		}
	}

}
