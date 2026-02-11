import java.util.*;

class Activity2_PartD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            st.push(arr[i]);

        int i = 0;
        while (!st.isEmpty())
            arr[i++] = st.pop();

        for (int x : arr)
            System.out.print(x + " ");
    }
}
