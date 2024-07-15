package com.learnjava.corejava.linkedlist;

public class SinglyLinkedList {

	Node head;
	Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public Node getHead() {
		return head;
	}

	// Add
	public void add(int data) {
		
		Node curr;
		
		// First Element
		if (head == null) {
			
			Node node = new Node(data);
			node.setNext(null);
			
			head = node;
			tail = node;

		}
		else {
		
			curr = head;
		
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			
			Node node = new Node(data);
			node.setNext(null);
			
			curr.setNext(node);
			tail = node;
		
		}
		
		
	}
	
	// Print
	public void print() {
		
		Node curr;
		curr = this.getHead();
		
		System.out.println("Printing elements in the order they were added : ");
		while(curr.getNext() != null) {
			
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
		
		// Printing the last element
		System.out.println(curr.getData());
		
	}
	
	
}
