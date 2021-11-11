
class Main {
  public static void main(String[] args) {

    Stack stack = new Stack();
    for (int n = 0; n < 20; ++n)  stack.push(n);
    for (int n = 0; n < 20; ++n)  System.out.print(stack.pop()+" ");
    System.out.println();
  }
}
