import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class HelpfulMaths {
    static class FastReader
    {
        BufferedReader br;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

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

        String s = in.nextLine();
        String[] str = s.split("\\+");
        ArrayList<Integer> onlyNums = new ArrayList<>();

        for (String x : str) onlyNums.add(Integer.parseInt(x));

        Collections.sort(onlyNums);

        StringBuilder output = new StringBuilder();
        for (int y : onlyNums) output.append(y+"+");

        out.print(output.substring(0, output.length() - 1));
        out.close();
    }
}
