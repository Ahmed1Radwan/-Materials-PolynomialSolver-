package iplementationOfDoublyLinkedList;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class doublyLinkedList implements IILinkedList {
	public int counter=0;
	public doublyNode head = null;
	public doublyNode tail = null;
	public doublyLinkedList() {
		
	}
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		doublyNode temp = new doublyNode(element);
		doublyNode curr = head;
		if(curr != null) {
			for(int i=0;i<index && curr.getNext() != null;i++) {
				curr = curr.getNext();
			}
		}
		temp.setNext(curr.getNext());
		temp.setPrev(curr);
		curr.setNext(temp);
		curr.getNext().prev = temp;
		incrementCounter();
	}
	private void incrementCounter() {
		counter++;
	}
	private int getCounter() {
		return counter;
	}
	private void decrementCounter() {
		counter--;
	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		if(head == null && tail == null) {
			head = tail = new doublyNode(element);
		}
		doublyNode temp = new doublyNode(element);
		doublyNode curr = head;
		if(curr != null) {
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
			temp.setPrev(tail);
			tail = tail.getNext();
			
		}
		incrementCounter();
		return;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index < 0) return null;
		doublyNode curr = null;
		if(head != null) {
			curr = head.getNext();
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) {
					return null;
				}
				curr = curr.getNext();
			}
			return curr.getData();
		}
		return curr;
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		if(index < 0 || index > size()-1) return;
		doublyNode curr = head.getNext();
		if(head != null) {
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) return;
				curr = curr.getNext();
			}
		}
		curr.setData(element);
		return;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if(head == null) return;
		doublyNode curr = head.getNext();
		while(curr!=null) {
			doublyNode temp = curr.getNext();
			curr = null;
			curr = temp;
		}
		head = null;
		tail = null;
		return;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(getCounter() == 0) return true;
		else return false;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index > (size() - 1)) {
			return;
		}
		
		doublyNode curr =head;
		if(index == 0) {
			head = head.getNext();
			head.prev = null;
		}
		if(head != null) {
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) return;
				curr = curr.getNext();
			}
		}
		curr.setNext(curr.getNext().getNext());
		curr.getNext().getNext().setPrev(curr);
		decrementCounter();
		return;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return getCounter();
	}

	@Override
	public IILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		if(head == null) return null;
		IILinkedList L = new doublyLinkedList();
		doublyNode curr = head.getNext();
		for(int i=0;i<size()&&curr != null;i++) {
			if(i>=fromIndex && i<=toIndex) {
				L.add(curr.getData());
			}
			curr = curr.getNext();
		}
		return L;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if(head == null) return false;
		doublyNode curr = head.getNext();
		if(head != null) {
			while(curr != null) {
				if(curr.getData() == o) {
					return true;
				}
				curr = curr.getNext();
			}
		}
		return false;
	}

}
