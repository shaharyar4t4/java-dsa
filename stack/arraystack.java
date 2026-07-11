
public class arraystack {

    int[] arr;
    int top; // top element of any array..
    int capacity; // size of array

    arraystack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // top ki value -1 mean stack me abhi koi value nhi hogi...
    }

    // Time complexcity is 0(1)
    // push is refer the insertion in aray..
    public void push(int x) {
        // this condition is applicable only.. when the stack is overflow means stack
        // capacity..
        if (isFull()) {
            System.out.print("Stack OverFlow - Cannot Push");
            return;
        }
        arr[++top] = x; // is line me ye horaha ha kiya top ki value update hoti ha tu x value update
                        // hoti ha...
        System.out.println("Insertion done..." + x);
    }

    // Time complexcity is 0(1)
    // pop is refer the delection in array..
    public int pop() {
        // you stack is empty..
        if (isEmpty()) {
            System.out.print("Stack is Empty!");
            return -1;
        }
        return arr[top--];
    }

    // Time complexcity is 0(1)
    // peek is refer the top element of stack.. or read the element
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        System.out.println("Stack is Empty!");
        return -1;
    }

    // Empty stack..
    public boolean isEmpty() {
        return top == -1;
    }

    // Stack have a value...
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Time complexcity is o(n)

    // for display the value...
    public void displaystack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("Stack Element: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        arraystack stk = new arraystack(3);

        stk.push(10);
        stk.push(20);
        stk.push(30);

        stk.displaystack();

        System.out.print("Top Element: " + stk.peek());

        int removed = stk.pop();
        System.err.println("Pop Element" + removed);
        stk.pop();
        stk.pop();
        stk.displaystack();

    }
}
