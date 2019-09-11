package dataStructure.queue.linkedList;

public class TestForStackQueue {

  public static void main(String[] args) throws Exception {
    StackUsingQueue stackUsingQueue = new StackUsingQueue();
    stackUsingQueue.push(1);
    stackUsingQueue.push(3);
    stackUsingQueue.push(4);
    stackUsingQueue.push(5);
    System.out.println("count :" +stackUsingQueue.queue.count);

    int val =stackUsingQueue.pop();
     System.out.println(val);
    stackUsingQueue.push(2);
    System.out.println("count :" +stackUsingQueue.queue.count);
    int val2 =stackUsingQueue.pop();
    System.out.println(val2);


    stackUsingQueue.push(10);
    stackUsingQueue.push(30);
    stackUsingQueue.push(40);
    stackUsingQueue.push(50);
    System.out.println("count :" +stackUsingQueue.queue.count);
    int val3 =stackUsingQueue.pop();
    System.out.println(val3);
  }
}
