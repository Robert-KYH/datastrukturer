
class Queue {
  private final int GROWTH = 10;

  private int front = 0, back = 0;
  private int reserve = GROWTH;
  private int data[] = new int[reserve];

  void enqueue(int n) {
    if (back == reserve) {
      int data2[] = new int[reserve+GROWTH];
      for (int i = front; i < back; ++i)  data2[i] = data[i];
      data = data2;
      reserve += GROWTH;
    }
    data[back++] = n;
  }

  int dequeue() {
    int n = data[front++];
    if (front == back)  clear();
    return n;
  }

  int peek()        {  return data[front];  }
  int size()        {  return back-front;   }
  void clear()      {  front = back = 0;    }
  boolean isEmpty() {  return size() == 0;  }
}
