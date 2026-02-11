import java.util.*;

class Activity1_PartD {

    static boolean check(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty())
                    return false;

                char t = st.pop();

                if (c == ')' && t != '(')
                    return false;
                if (c == '}' && t != '{')
                    return false;
                if (c == ']' && t != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String s = sc.nextLine();

        if (check(s))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
