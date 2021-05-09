package HomeWorkApp;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        printMetod1();

        System.out.println("Результат 1 " + printMetod11(10, 15));
        System.out.println("****************");

        printMetod2();

        System.out.println("Результат 3 " + printMetod3( 10 ));
        System.out.println("****************");

        printMetod4( "Hello" , 5);
        System.out.println("****************");
           }
    public static void printMetod1() {
        int a = 10;
        int b = 9;
        int c = a + b;
        if (c > 10 && c <= 20) {
            System.out.println("true");
        }
        if (c >= 20) {
            System.out.println("false");
        }
        }
    public static boolean printMetod11(int a, int b) {
        return (a + b <= 20) && (a + b >= 10);
    }
    public static void printMetod2() {
        int a = - 2;
        if (a >= 0) {
            System.out.println( a   +  " is positive");
        }
        else  {
        System.out.println( a + " is negative");
        System.out.println("****************");
        }
    }
    public static boolean  printMetod3( int a) {
        {
         return a <= 0;  }
    }
    public static void printMetod4 (String value, int count) {
    for (int a = 0; a < count; a ++) {
        System.out.println("String #" + a + ":" + value);
    }
    }
}

