package com.learnjava.corejava.StackImpl;

public class StackImpl {
	
	int[] array;
	int top;
	
	public StackImpl() {
	}
	
	public StackImpl(int capacity) {
		array = new int[capacity];
		top = -1;
	}

	private int getTop() {
		return top;
	}

	private void setTop(int top) {
		this.top = top;
	}
	
	public void push(int number) {
		top++;
		array[top] = number; 
	}
	
	public int pop() {
		
		int currTop = this.getTop();
		
		if (currTop == -1) {
			System.out.println("No elements in the stack !");
			return 0;
		}
		
		int nextTop = currTop-1;
		this.setTop(nextTop);
		return array[currTop];
		
	}
	
	public int peek() {
	
		int currTop = this.getTop();
		
		if (currTop == -1) {
			System.out.println("No elements in the stack !");
			return 0;
		}
		
		return array[currTop];
	}
	
}
