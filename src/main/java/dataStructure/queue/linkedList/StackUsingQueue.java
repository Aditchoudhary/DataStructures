package dataStructure.queue.linkedList;

public class StackUsingQueue {

  Queue<Integer> queue = new Queue<>();

  public int pop() throws Exception {

    return queue.dequeue();
  }

  public void push(int value) throws Exception {
    int size = queue.count;
    queue.enqueue(value);

    for (int i = 0; i < size; i++) {
     int x = queue.dequeue();
     queue.enqueue(x);
    }

  }


}
