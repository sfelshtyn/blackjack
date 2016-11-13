import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m;
        int np = 0;

        int pp = 0;
        m = in.nextInt();
        int[] a = new int[m];
        int[] p = new int[m];
        int[] n = new int[m];
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                p[pp] = a[i];
                pp = pp + 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                n[np] = a[i];
                np = np + 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i < pp) a[i] = p[i];
            else a[i] = n[i - pp];
        }
        for (int i = 0; i < a.length; i++)
            out.print(a[i] + " ");
    }
}
