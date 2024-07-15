package com.learnjava.corejava;

import com.learnjava.corejava.StackImpl.StackImpl;
import com.learnjava.corejava.linkedlist.SinglyLinkedList;

public class DataStructure {

	public static void main(String[] args) {
		
		// Linked List Implementation 
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.print();
		
		
		// Stack Implementation
		StackImpl stackImpl = new StackImpl(6);
		stackImpl.push(10);
		stackImpl.push(20);
		stackImpl.push(40);
		
		System.out.println("Initial Peek : " + stackImpl.peek());
		
		stackImpl.pop();
		
		System.out.println("Popping off 40 : " + stackImpl.peek());
		
		stackImpl.push(30);
		stackImpl.push(40);
		
		System.out.println("Peeking again after adding 30 : " + stackImpl.peek());

	}

}
