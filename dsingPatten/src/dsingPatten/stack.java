package dsingPatten;


public class stack {

	private Node top;
	
	public boolean isEmpty() {
		return top == null;
		
	}
	public void push(int data) {
		Node newData = new Node(data);
		
		if(top == null) {
			top = newData;
			return;
		}
		newData.next = top;
		top = newData;
		
	}
	public int pop() {
		if(isEmpty())
			return -1;
		
		int poped = top.data;
		top = top.next;
		return poped;
		
	}
	public void print() {
		Node tmp = top;
		while(tmp != null) {
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
}
