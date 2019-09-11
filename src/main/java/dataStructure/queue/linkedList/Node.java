package dataStructure.queue.linkedList;

public class Node<T> {

	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node(T value) {
		super();
		this.value = value;
	}
	T value;
	Node next;
	
}
