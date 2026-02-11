import java.util.*;

class Activity2_PartC {

    static int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }

    static String convert(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                res += c;
            else if (c == '(')
                st.push(c);
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    res += st.pop();
                st.pop();
            } else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek()))
                    res += st.pop();
                st.push(c);
            }
        }

        while (!st.isEmpty())
            res += st.pop();

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convert(s));
    }
}
