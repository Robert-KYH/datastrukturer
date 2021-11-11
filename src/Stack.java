
class Stack {
  private final int GROWTH = 10;

  private int size = 0;
  private int reserve = GROWTH;
  private int data[] = new int[reserve];

  void push(int n) {
    if (size == reserve) {
      int data2[] = new int[reserve+GROWTH];
      for (int i = 0; i < reserve; ++i)  data2[i] = data[i];
      data = data2;
      reserve += GROWTH;
    }
    data[size++] = n;
  }

  int pop()         {  return data[--size];  }
  int peek()        {  return data[size-1];  }
  int size()        {  return size;          }
  void clear()      {  size = 0;             }
  boolean isEmpty() {  return size == 0;     }
}
