package com.learnjava.corejava.StackImpl;

public class Element {

	private int index;
	private int data;
	
	public Element(int index, int data) {
		this.index = index;
		this.data = data;
	}
	private int getIndex() {
		return index;
	}
	private void setIndex(int index) {
		this.index = index;
	}
	private int getData() {
		return data;
	}
	private void setData(int data) {
		this.data = data;
	}
	
	
}
