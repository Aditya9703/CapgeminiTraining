import java.util.*;

class Activity1_PartC {

    static int[] st;
    static int top = -1;
    static int n;

    static void push(int x) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        st[++top] = x;
        System.out.println(x + " pushed");
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(st[top--] + " popped");
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Top: " + st[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();
        st = new int[n];

        while (true) {
            System.out.println("1.Push  2.Pop  3.Peek  4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                int x = sc.nextInt();
                push(x);
            } else if (ch == 2) {
                pop();
            } else if (ch == 3) {
                peek();
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
