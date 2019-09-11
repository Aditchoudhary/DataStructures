package dataStructure.linkedlist;

public class MainClass {

  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.add(7);
    ll.add(8);
    //ll.add(9);


    ll.rotateWithK(ll.head, 3);
    //ll.reverse(null, ll.head);
    ll.printLinkedList();
    //ll.getMiddleElement(ll.head);

		/*ll.add(5);
		ll.add(6);*/

    /*
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(10);
		ll2.add(20);
		ll2.add(30);
		ll2.add(40);
		ll2.add(50);
		ll2.add(60);
		ll2.head = ll.mergeTwoLinkedList(ll.head, ll2.head);
		ll.printLinkedList();
		System.out.println("Second Linked List");
		ll2.printLinkedList();

		*/


		/*ll.head = ll.rotate(ll.head,3);
		ll.printLinkedList(ll.head);*/


		/*ll.add(1);
		ll.add(9);
		ll.add(9);
		ll.add(9);
		ll.AddOne(ll.head);*/

    //ll.head = ll.reverseLinkedListUsingThreePoint(ll.head);
    //ll.printLinkedList();

    //ll.printReverse(ll.head);
    //ll.printReverseLinkedListUsingThreePointer(ll.head);
    //ll.findMiddleAndDeleteElement(ll.head);
    //ll.printLinkedList();
  }


}
