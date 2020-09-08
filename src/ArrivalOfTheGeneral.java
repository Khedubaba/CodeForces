import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {
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
        LinkedList<Integer> soldiers = new LinkedList<>();
        int output = 0;

        int n = in.nextInt();
        String[] inpHeights = in.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            soldiers.add(i, Integer.parseInt(inpHeights[i]));
        }

        int minHeight = soldiers.stream().min(Integer::compareTo).get();
        int maxHeight = soldiers.stream().max(Integer::compareTo).get();

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (soldiers.get(i) == minHeight) minIndex = i;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (soldiers.get(i) == maxHeight) maxIndex = i;
        }

        if (minIndex < maxIndex) {
            //collison occurs thus one swap reduced from total
            output = (((n - 1) - minIndex) + (maxIndex - 0)) - 1;
        }
        else output = ((n - 1) - minIndex) + (maxIndex - 0);

        out.print(output);
        out.close();
    }
}
