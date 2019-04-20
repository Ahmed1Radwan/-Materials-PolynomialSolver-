package iplementationOfDoublyLinkedList;


public class doublyNode {
	doublyNode next; // reference
	doublyNode prev;
	Object data; // data in stored in each node
	public doublyNode(Object val) { // constructor
		next = null;
		prev = null;
		data = val;
	}
	public doublyNode(Object val,doublyNode nextVal,doublyNode prevVal) { // to point to specific Node
		next = nextVal;
		prev = prevVal;
		data = val;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object val) {
		data = val;
	}
	public doublyNode getNext() {
		return next;
	}
	public doublyNode getPrev() {
		return prev;
	}
	public void setNext(doublyNode nextVal) {
		next = nextVal;
	}
	public void setPrev(doublyNode prevVal) {
		prev = prevVal;
	}
}
