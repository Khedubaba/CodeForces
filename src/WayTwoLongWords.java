import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WayTwoLongWords {
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
        HashMap<Integer, String> words = new HashMap<>();

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            String word = in.nextLine();
            words.put(i, word);
        }

        for (int i=1; i<=words.size(); i++) {
            String word = words.get(i);
            int wordLength = words.get(i).length();
            if (wordLength > 10) {
                int numInBtw = wordLength - 2;
                String output = word.charAt(0) + Integer.toString(numInBtw) + word.charAt(wordLength-1);
                out.println(output);
            }
            else {
                out.println(word);
            }
        }

        out.close();
    }
}
