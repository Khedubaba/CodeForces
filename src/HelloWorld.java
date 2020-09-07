import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    static Scanner sc = new Scanner(System.in);
    final double SHORTPI = 3.14151;
    public enum Day {Monday, Tuesday, Wednesday};

    public static void main(String[] args){
        System.out.println("Hello World");

        int fromStart = Math.abs(1 - 2);
        System.out.println("fromstart: " + fromStart);

        //All about primitive data types
        System.out.println("Byte Max: "+ Long.MAX_VALUE);
        System.out.println("Byte Max: "+ Long.MIN_VALUE);
        char a = 'a';
//        \n \b \t \f \r \" \' \\
        float fNum = 1.11111111111111111F;
        float fNum2 = 1.11111111111111111F;
        System.out.println("Float: "+ (fNum + fNum2));

        double thousand = 1e+3;
        System.out.println(thousand);

        //type casting
        long bigLong = 215657665643L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        double dbNum = 41.212122212132;
        String favNum = Double.toString(dbNum);
        System.out.println("Double to String: "+favNum);
        double dbNum2 = Double.parseDouble(favNum);
        System.out.println("String to Double: "+dbNum2);


        //Maths Functions
        //Math.abs(-1) Math.ceil(4.21) Math.floor(4.23) Math.round(4.21) Math.max(2,5) Math.min(4,5) Math.sqrt(4) Math.cbrt(4) Math.pow(2,2) Math.hypot(5,5) Math.PI

        //Randon number Generator
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        System.out.println("Random: " + randNum);

        //Strings are Objects or also called reference type
        System.out.println("\nStrings and its functions");
        String name, wName, drsDog;
        name = "Aditya";
        wName = name + " Khedekar";
        wName += " is my name";
        drsDog = "k" + 9;

        System.out.println(drsDog);
        System.out.println(wName.charAt(0));
        System.out.println("conrains: "+wName.contains("Adi"));
        System.out.println(wName.indexOf("Adi"));
        System.out.println("length:"+wName.length());
        System.out.println("dogs equals cat: " + ("dogs".equals("cats")));
        System.out.println("dogs equals cat: " + ("Dogs".equalsIgnoreCase("bats")));
        System.out.println(wName.compareTo("Aditya Khg"));
        System.out.println(wName.replace("Aditya", "Sudeshna"));
        System.out.println(wName.substring(0,6));
        //converting string into array
        System.out.println("==>First step for converting string into array using for each loop<==");

        //special
        for(String x: wName.split(" ")){
            System.out.println(x);
        }
        //charAt(i), contains(string), indexOf("string"), length(), equals(string), equalsIgnoreCases("string")
        // compareTo("string"), replace("TARGETString", "Replacementstring"),
        // substring(i, j), split("regex"), trim, toUpperCase, toLowerCase,




        //StingBuilder and StringBuffer
        //when you making many string changes prefer to use StringBuilder coz every time
        //you make use of string it creates new place in memory
        //And difference btw StringBuilder and StringBuffer is later is used in threads

        System.out.println("\n\n===>StringBuilder and StringBuffers<===");

        StringBuilder sb = new StringBuilder("I am a StringBuilder");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); //
        sb.append(" Yeah");//
        System.out.println(sb.insert(6, " Big"));//
        System.out.println(sb.replace(6, 9, " wig"));//
        System.out.println(sb.substring(6, 10));
        System.out.println(sb.delete(6, 11));//
        System.out.println(sb.charAt(5));
        System.out.println(sb.indexOf("Yeah"));

        //every mehods of stingbuilder is also string buffer
        System.out.println("\n ");
        StringBuffer sb1 = new StringBuffer("I am a StringBuffer");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity()); //
        sb1.append(" Yeah");//
        System.out.println(sb1.insert(6, " Big"));//
        System.out.println(sb1.replace(6, 9, " wig"));//
        System.out.println(sb1.substring(6, 10));
        System.out.println(sb1.delete(6, 11));//
        System.out.println(sb1.charAt(5));
        System.out.println(sb1.indexOf("Yeah"));




        //Arrays
        System.out.println("\n\n===>All about Arrays<===");

        int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1,2); //fills every spot of array with 2
        System.out.println(a1[0]);
        System.out.println(a1.length);

        String[] a2 = {"one", "two"};

        //special
        int[] oneToTen = IntStream.rangeClosed(1, 10).toArray();

        for(int x: oneToTen){
            System.out.println(x);
        }

        System.out.println("Binarysearch:" + Arrays.binarySearch(oneToTen, 9));

        int a3[][] = new int[2][2];
        String[][] a4 = {{"0", "1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8"}};
        System.out.println(a4[2][2]);
        for (String[] x : a4){
            System.out.println(Arrays.toString(x));
        }

        int minMaxSum = 10 + -19;
        System.out.println(minMaxSum);
        LinkedList<Integer> lkdd = new LinkedList<>();
        lkdd.addAll(Arrays.asList(10, 8, 8, -6, 4, -2, 0, 2, -4, 6, -8, -10));
        lkdd.remove(0);
        lkdd.add(0, 420);
        for (int xc : lkdd){
            System.out.println(xc);
        }
//        Collections.sort(lkdd);
        System.out.println("lkdd last: " + lkdd.getLast());
        String[][][] a5 = {{{"000"}, {"100"}, {"200"}, {"300"}},
                {{"010"}, {"110"}, {"210"}, {"310"}},
                {{"020"}, {"120"}, {"220"}, {"320", "321"}}};

        System.out.println(a5[2][3][1]);

        int multAll = IntStream.range(1,5).reduce(1, (x, y) -> x*y);
        System.out.println("multAll: " + multAll);

        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6, 2);
        System.out.println(Arrays.toString(a7));
        System.out.println(Arrays.equals(a6, a7));
        int[] a8 = {3,2,1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));


        //ArrayList
        System.out.println("\n\n===>All about ArrayList<===");

        ArrayList<String> al1 = new ArrayList<String>(20);
        al1.add("khedu");
        char[] cha = al1.get(0).toCharArray();
        Object[] a10 = al1.toArray();
        ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(1,4,2,3));
        Collections.sort(al2);
        System.out.println(Collections.binarySearch(al2, 5));
        for(int x: al2){
            System.out.print(x);
        }

        System.out.println("\nget: "+al2.get(3));
        al2.set(1,5);
        al2.remove(3);

        //Iterator is used to cycle to collection like arraylist
        Iterator it = al2.iterator();
        System.out.println("\n");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //LinkedList: basically used when u need to make many changes in the middle of the list
        System.out.println("\n\n===>All about LinkedList<===");

        LinkedList<Integer> il1 = new LinkedList<Integer>();
        il1.add(1);
        il1.add(2); il1.add(3);
        il1.addAll(Arrays.asList(1,2,3,4,5));
        il1.addFirst(0);
        il1.addLast(6);
        System.out.println("contains: " + il1.contains(2));
        System.out.println(il1.indexOf(4));
        il1.set(0,2);
        System.out.println(il1.get(0));
        System.out.println(il1.getFirst());
        System.out.println(il1.getLast());
        System.out.println(il1.getLast());
        il1.remove(1);
        System.out.println("\n"+il1.size());
        Object[] a9 = il1.toArray();

        for(int x: il1){
            System.out.println(x);
        }


        //Getting user input
//        System.out.println("\n\n===>All about Getting user Input<===");
//        System.out.print("Enter name: ");
//        if(sc.hasNextLine()){
//            String userName = sc.nextLine();
//            System.out.println("Your name is "+userName);
//        }

        //Ternary operators eg
//        System.out.print("Enter Age: ");
//        if(sc.hasNextLine()){
//            int age = sc.nextInt();
//            Boolean canVote = (age >= 18) ? true : false;
//            if (canVote)
//            {
//                System.out.println("Your age is " + age + " you can Vote");
//            }
//            else{
//                System.out.println("You are a minor");
//            }
//
//        }
        sc.close();

        //Parametric method to handle multiple or unknown number of parameter inputs
        System.out.println("\n\n===>Unknown number of parameters method<===");
        System.out.println("Sum: "+getSum(1,2,3,4,5,6));

        //getting multiple values from method
        int[] multVA = getNext(5);
        for (int x: multVA){
            System.out.println(x);
        }

        //receiving multiple values of different types
        List<Object> randList = getRandList();
        System.out.println(randList);



        //Recursive Function Example
        System.out.println("\n==>> Recursive Function Example");
        System.out.println("Fact 4 = " + factorial(4));

        int[] nums = {1,2,3};
        System.out.println("Sum = " + getSum3(nums));


        //Enum are custom data types you define
        System.out.println("\n ==>> Enum Example");
        Day favDay = Day.Monday;
        System.out.println("Fav day is " +  favDay);

    }


    //All Methods of class

    static int getSum3(int[] nums){
        int sum = 0;
        for (int x : nums){
            sum += x;
        }
        return sum;
    }

    //Recursive Function
    static  int factorial(int num){
        if (num == 1){
            return 1;
        }
        else{
            int result = num * factorial(num - 1);
            return result;
        }
    }


    static List<Object> getRandList(){
        String name = "Aditya";
        int age = 23;
        return Arrays.asList(name, age);
    }

    static int[] getNext(int x){
        int[] val = new int[2];
        val[0] = x+1;
        val[1] = x+2;
        return val;
    }

    public static int getSum(int ... numbers){
        int sum = 0;
        for(int x: numbers){
            sum += x;
        }
        return sum;
    }
}
