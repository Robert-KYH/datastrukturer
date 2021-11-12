
class Main {
  public static void main(String[] args) {

    var stack = new Stack();
    for (int n = 0; n < 20; ++n)  stack.push(n);
    for (int n = 0; n < 20; ++n)  System.out.print(stack.pop()+" ");
    System.out.println();


    var queue = new Queue();
    for (int n = 0; n < 20; ++n)  queue.enqueue(n);
    for (int n = 0; n < 20; ++n)  System.out.print(queue.dequeue()+" ");
    System.out.println();


    var prioqueue = new PrioQueue();
    for (int n = 0; n < 20; ++n)  prioqueue.enqueue(n*7%20);
    for (int n = 0; n < 20; ++n)  System.out.print(prioqueue.dequeue()+" ");
    System.out.println();


    var list_ref = new java.util.LinkedList<Integer>();
    var list_tst = new LinkedList();

    for (int n = 0; n < 10; ++n) {
      list_ref.addFirst(n);
      list_ref.addLast(n+10);
      list_ref.add(list_ref.size()/2, n+20);

      list_tst.insert(n, 0);
      list_tst.insert(n+10, list_tst.size());
      list_tst.insert(n+20, list_tst.size()/2);
    }

    System.out.println(list_ref.size()+" "+list_tst.size());
    for (int i = 0; i < 30; ++i)  System.out.print(list_ref.get(i)+" ");
    System.out.println();
    for (int i = 0; i < 30; ++i)  System.out.print(list_tst.valueAt(i)+" ");
    System.out.println();

    String res = "ok";
    for (int n = 0; n < 15; ++n) {
      if (list_ref.removeFirst() != list_tst.remove(0))                {  res = "error";  break;  }
      if (list_ref.removeLast() != list_tst.remove(list_tst.size()-1)) {  res = "error";  break;  }
    }

    System.out.println(list_ref.size()+" "+list_tst.size());
    System.out.println("LinkedList: "+res);
  }
}
