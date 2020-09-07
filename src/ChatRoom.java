import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChatRoom {
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

        String[] s = in.nextLine().toLowerCase().split("");
        String[] hello = "hello".split("");

        int j = 0;

        for (String value : s) {
            if (value.equals(hello[j]) && j == 0) {
                j++;
            }
            else if (value.equals(hello[j]) ) {
                j++;
                if (j >= hello.length) break;
            }
        }

        if (j == hello.length) out.print("YES");
        else out.print("NO");

        out.close();
    }
}
