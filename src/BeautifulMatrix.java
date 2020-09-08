import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BeautifulMatrix {
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

        int minMoves = 0;
        int[] posOfOne  = new int[2];

        for (int i = 0; i < 5; i++) {
            String[] s = in.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                int inp = Integer.parseInt(s[j]);
                if (inp == 1) {
                    posOfOne[0] = i;
                    posOfOne[1] = j;
                }
            }
        }

        for (int x : posOfOne) {
            int a = Math.abs(2 - x);
            minMoves+=a;
        }

        out.print(minMoves);
        out.close();
    }
}
