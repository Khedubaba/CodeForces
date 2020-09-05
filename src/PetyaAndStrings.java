import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PetyaAndStrings {
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

        String a = in.nextLine();
        String b = in.nextLine();

        if (a.compareToIgnoreCase(b) == 0) out.print(0);
        else if(a.compareToIgnoreCase(b) < 0) out.print(-1);
        else if(a.compareToIgnoreCase(b) > 0) out.print(1);

        out.close();
    }
}
