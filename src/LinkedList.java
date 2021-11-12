
class LinkedList {

  private int size = 0;
  private Node first = null, last = null;

  private class Node {
    int data;
    Node prev = null, next = null;
    Node(int n) {  data = n;  }
  }

  private Node nodeAt(int i) {
    if (i == size-1)  return last;
    Node p = first;
    for (int n = 0; n < i; ++n)  p = p.next;
    return p;
  }

  int remove(int i) {
    Node p = nodeAt(i);

    if (p.prev == null)  first = p.next;
    else                 p.prev.next = p.next;

    if (p.next == null)  last = p.prev;
    else                 p.next.prev = p.prev;

    --size;
    return p.data;
  }


  void insert(int v, int i) {
    var n = new Node(v);

    if (size == 0) {
      first = last = n;
      ++size;
      return;
    }

    if (i == 0) {
      n.next = first;
      first.prev = n;
      first = n;
    } else if (i == size) {
      n.prev = last;
      last.next = n;
      last = n;
    } else {
      Node p = nodeAt(i);
      n.prev = p.prev;
      n.next = p;
      p.prev.next = n;
      p.prev = n;
    }

    ++size;
  }


  int indexOf(int n) {
    Node p = first;
    for (int i = 0; i < size; ++i)
      if (p.data == n)  return i;
      else              p = p.next;

    return -1;
  }


  int valueAt(int i) {  return nodeAt(i).data;           }
  int size()         {  return size;                     }
  void clear()       {  first = last = null;  size = 0;  }
  boolean isEmpty()  {  return size == 0;                }
}
