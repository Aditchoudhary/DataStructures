package dataStructure.doublylinkedlist;

public class Node<T> {
	
	Node<T> prev;
	Node<T> next;
	T value;
	
	public Node(T value) {
		this.value = value; 
	}
	
}
