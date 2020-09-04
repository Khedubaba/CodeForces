import java.io.*;
import java.util.StringTokenizer;

public class Watermelon {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int weight = in.nextInt();
        if (weight % 2 == 0 && weight>0 && weight != 2) {
            out.print("YES");
        }
        else {
            out.print("NO");
        }
        out.close();
    }
}
