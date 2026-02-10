package capg;

public class TaskC_2 {

    static class N {
        int d;
        N n;
        N(int d) {
            this.d = d;
        }
    }

    static N h;

    static void addPos(int x, int p) {
        N t = new N(x);
        if (p == 0) {
            t.n = h;
            h = t;
            return;
        }
        N c = h;
        for (int i = 0; i < p - 1 && c != null; i++)
            c = c.n;
        if (c != null) {
            t.n = c.n;
            c.n = t;
        }
    }

    static void del(int x) {
        if (h == null)
            return;
        if (h.d == x) {
            h = h.n;
            return;
        }
        N c = h;
        while (c.n != null) {
            if (c.n.d == x) {
                c.n = c.n.n;
                return;
            }
            c = c.n;
        }
    }

    static int cnt() {
        int c = 0;
        N t = h;
        while (t != null) {
            c++;
            t = t.n;
        }
        return c;
    }

    static int mid() {
        N s = h, f = h;
        while (f != null && f.n != null) {
            s = s.n;
            f = f.n.n;
        }
        return s.d;
    }

    static void rev() {
        N p = null, c = h, nx;
        while (c != null) {
            nx = c.n;
            c.n = p;
            p = c;
            c = nx;
        }
        h = p;
    }

    static void trav() {
        N c = h;
        while (c != null) {
            System.out.print(c.d + " ");
            c = c.n;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        addPos(10, 0);
        addPos(20, 1);
        addPos(30, 2);
        addPos(40, 3);
        addPos(25, 2);

        trav();

        del(20);
        trav();

        System.out.println(cnt());
        System.out.println(mid());

        rev();
        trav();
    }
}
