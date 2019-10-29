package dataStructure.linkedlist;

/**
 * @link https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/
 */
public class IntersectYShape {

    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    public static void main(String[] args) {

        Node intersect = new Node(15);

        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = intersect;
        headA.next.next.next.next = new Node(30);


        Node headB = new Node(10);
        headB.next = intersect;
        headB.next.next = new Node(30);

        int intersectNodeValue = intersectPoint(headA,headB);
        System.out.println("intersectNodeValue = " + intersectNodeValue);
    }

   static int intersectPoint(Node headA, Node headB)
    {
        Node currentA = headA;
        Node currentB = headB;

        int lengthA =0 ;
        int lengthB =0 ;

        while(currentA!=null){
            currentA = currentA.next;
            lengthA++;
        }

        while(currentB!=null){
            currentB = currentB.next;
            lengthB++;
        }

        int diff = Math.abs(lengthA- lengthB);

        if(lengthA>lengthB){
            return traverse(headB,headA,diff);
        }else{
            return traverse(headA,headB,diff);
        }

    }

    private static int traverse(Node headSmall, Node headLarge, int diff){
        Node currentSmall = headSmall;
        Node currentLarge = headLarge;

        int count = 0;
        while(count!=diff && currentLarge !=null){
            currentLarge = currentLarge.next;
            count++;
        }

        while(currentLarge!=currentSmall && currentLarge !=null && currentSmall!=null){
            currentLarge = currentLarge.next;
            currentSmall = currentSmall.next;
        }

        if(currentLarge==currentSmall){
            return currentLarge.data;
        }
        return -1;
    }


}
