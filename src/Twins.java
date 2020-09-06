import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Twins {
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

        int coinSum = 0, minCoinsCount = 0, twinCoinSum = 0;
        ArrayList<Integer> coins = new ArrayList<>();
        int n = in.nextInt();
        String[] str = in.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            coins.add(i, Integer.parseInt(str[i]));
        }

        Collections.sort(coins);

        for (int x : coins) coinSum += x;

        for (int i = coins.size() - 1; i >= 0; i--) {
            if (coinSum >= twinCoinSum) {
                ++minCoinsCount;
                twinCoinSum += coins.get(i);
                coinSum -= coins.get(i);
            }
        }

        out.println(minCoinsCount);
        out.close();
    }
}
