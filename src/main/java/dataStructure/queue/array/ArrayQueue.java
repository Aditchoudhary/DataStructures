package dataStructure.queue.array;

public class ArrayQueue {
  int[] pipeline = new int[0];
  int size = 0;

  int head = 0;
  int tail = -1;

  public void enqueue(int value) {

    if (size == pipeline.length) {
      int newSize = (size == 0) ? 4 : size * 2;

      if (size > 0) {
        int[] newArray = new int[newSize];
        size = 0;
        if (tail < head) {

          for (int i = 0; i <= pipeline.length - 1; i++) {
            newArray[i] = pipeline[head];
            size++;
          }

          for (int i = 0; i <= tail; i++) {
            newArray[++size] = pipeline[i];
          }
        } else {
          for (int i = 0; i < pipeline.length; i++) {
            newArray[i] = pipeline[i];
            size++;
          }

        }
        //for adding new value after wrapping array
        tail = size;
        newArray[tail] = value;
        pipeline = newArray;
        size++;
        head = 0;

      } else {
        pipeline = new int[newSize];
        pipeline[size++] = value;
        tail++;
      }
    } else {

      if (tail == pipeline.length - 1) {
        tail = 0;
        pipeline[tail] = value;
        size++;
      } else {
        pipeline[++tail] = value;
        size++;
      }
    }
  }

  public void printQueue() {
    for (int i = 0; i < pipeline.length; i++) {
      System.out.println(pipeline[i]);
    }
  }

  public int dequeue() throws Exception{
    int value = 0;
    if(size>0){
     value = pipeline[head];
    pipeline[head] = 0;
    }else {
      throw new Exception("Queue is Empty");
    }
    if (head == pipeline.length - 1 && tail <= head) {
      head = 0;
    } else {
      head++;
    }
    size--;
    return value;
  }

}
