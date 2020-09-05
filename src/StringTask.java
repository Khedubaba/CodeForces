import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class StringTask {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

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

        String word = in.nextLine().toLowerCase();
        StringBuilder noVowelsWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y') {
                noVowelsWord.append(ch);
            }
        }


        int wordLength = noVowelsWord.length();
        int lenAfterDots = wordLength*2;
        int j = 0;

        char[] finalStr = new char[lenAfterDots];
        for (int i = 0; i < finalStr.length; i++) {

            if (i==0){
                finalStr[j] = '.';
            }
            else if (i % 2 == 0){
                finalStr[i] = '.';
            }
            else {
                if (j < wordLength) {
                    finalStr[i] = noVowelsWord.charAt(j);
                    ++j;
                }
            }
        }

        for (char ch : finalStr) out.print(ch);

        out.close();
    }
}
