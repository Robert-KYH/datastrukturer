
class PrioQueue {
  private final int GROWTH = 10;

  private int size = 0;
  private int reserve = GROWTH;
  private int data[] = new int[reserve];

  void enqueue(int n) {
    if (size == reserve) {
      int data2[] = new int[reserve+GROWTH];
      for (int i = 0; i < size; ++i)  data2[i] = data[i];
      data = data2;
      reserve += GROWTH;
    }

    int i;
    for (i = size; i >= 0; --i) {
      if (i == 0  ||  n >= data[i-1])  break;
      data[i] = data[i-1];
    }

    data[i] = n;
    ++size;
  }

  int dequeue()     {  return data[--size];  }
  int peek()        {  return data[size-1];  }
  int size()        {  return size;          }
  void clear()      {  size = 0;             }
  boolean isEmpty() {  return size == 0;     }
}
