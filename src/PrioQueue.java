
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
    data[size++] = n;
  }

  int dequeue() {
    int i = 0, max = data[i];
    for (int j = 1; j < size; ++j) {
      if (data[j] > max) {
        max = data[j];
        i = j;
      }
    }

    for (; i < size-1; ++i)  data[i] = data[i+1];
    --size;
    return max;
  }

  int peek()        {  return data[size-1];  }
  int size()        {  return size;          }
  void clear()      {  size = 0;             }
  boolean isEmpty() {  return size == 0;     }
}
