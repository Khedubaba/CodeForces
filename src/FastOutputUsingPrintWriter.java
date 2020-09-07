import java.io.FileWriter;
import java.io.PrintWriter;

public class FastOutputUsingPrintWriter {
    public static void main(String...args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
//        PrintWriter out = new PrintWriter(new FileWriter(""));
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            out.print("abcdefghijk ");
            out.print(String.valueOf(i));
            out.print('\n');
        }
        out.flush();
        out.close();
        System.err.println("Loop time: " + (System.currentTimeMillis() - start));
    }
}

/*
        //illustrating print(boolean b) method
        out.print(true);

        //illustrating print(int i) method
        out.print(1);

        //illustrating print(float f) method
        out.print(4.533f);

        //illustrating print(String s) method
        out.print("GeeksforGeeks");
        out.println();

        //illustrating print(Object Obj) method
        out.print(out);
        out.println();

        //illustrating append(CharSequence csq) method
        out.append("Geek");
        out.println();

        //illustrating checkError() method
        out.println(out.checkError());

        //illustrating format() method
        out.format(Locale.UK, "This is my %s program", s);

        //illustrating flush method
        out.flush();

        //illustrating close method
        out.close();

*/
