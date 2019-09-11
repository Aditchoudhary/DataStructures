package dataStructure.doublylinkedlist;

public class LinkedList<T> {
	
	int count; 
	Node<T> head;
	Node<T> tail;
 	
	public void add(T value){
		Node<T> newNode = new Node<T>(value);	

		if(count == 0)
		{
			head = newNode;
			tail = newNode;
			count ++ ;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			count ++;
		}
	}
	
	public void printList() {
		
		if(count>0) {
			Node<T> current = head;
			while(current != null) {
				System.out.println(current.value);
				current = current.next;
			}
		}
	}
	
	public void deleteAtLast() throws Exception{
		if(count == 0) {
			
			throw new Exception("LinkedList is Empty");
		} else {
			tail = tail.prev;
			tail.next = null;
			count--;
		}
	}
}
