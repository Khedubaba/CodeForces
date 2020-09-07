import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LuckyDivision {
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

        String[] inpNum = in.nextLine().split("");
        boolean[] flags = new boolean[inpNum.length];
        StringBuilder theNum = new StringBuilder();
        boolean isLucky = true;

        for (String s : inpNum) theNum.append(s);

        int num = Integer.parseInt(String.valueOf(theNum));

        if (num % 4 == 0 || num % 7 == 0 || num % 44 == 0 || num % 47 == 0 ||
                num % 77 == 0 || num % 444 == 0 || num % 447 == 0 || num % 477 == 0 ||
                num % 777 == 0 || num % 474 == 0 || num % 744 == 0 || num % 747 == 0 ||
                num % 74 == 0) {
            out.print("YES");
        }
        else {
            for (int i = 0; i < inpNum.length; i++) {

                if (Integer.parseInt(inpNum[i]) == 4 || Integer.parseInt(inpNum[i]) == 7) {
                    flags[i] = true;
                }
                else flags[i] = false;
            }

            for (boolean x : flags) {
                if (!x) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) out.print("YES");
            else out.print("NO");
        }

        out.close();
    }
}
