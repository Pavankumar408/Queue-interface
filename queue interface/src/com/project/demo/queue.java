package com.project.demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	public static void main(String[]args) {
		Queue<Integer> number=new PriorityQueue<Integer>();
		number.add(67);
	//	number.add(90);
		number.add(34);
		number.add(45);
		number.add(56);
		number.add(67);
		number.add(78);
		System.out.println(number);
		for(Integer itr:number) {
			System.out.println(itr);
		}
	}

}
