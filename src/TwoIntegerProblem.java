import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class TwoIntegerProblem {
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

        String nextLine()
        {
            String str = "";
            try {str = br.readLine();}
            catch (IOException e) {e.printStackTrace();}
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Integer, Integer> diffs = new HashMap<>();

        int T = in.nextInt();

        for (int i=1; i<=T; i++) {
            String[] s = in.nextLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (a == b) diffs.put(i, 0);
            else if (a > b) diffs.put(i, a-b);
            else diffs.put(i, b-a);
        }

        for (int i = 1; i <= diffs.size(); i++) {
            if (diffs.get(i) == 0) out.println(0);
            else {
                int tenCount = diffs.get(i)/10;
                if (diffs.get(i) % 10 == 0) out.println(tenCount);
                else out.println(tenCount + 1);
            }
        }

        out.close();
    }
}
