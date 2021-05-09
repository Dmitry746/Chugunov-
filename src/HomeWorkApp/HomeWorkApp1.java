package HomeWorkApp;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

                                                                                                                                                                                                                                                                                                                                                                    public static void printThreeWords() {
        System.out.print("_Orange\n");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int checkSumSignA = 6000000;
        int checkSumSignB = 6100000;
        int c = checkSumSignA - checkSumSignB;
        if (c >= 0) {
            System.out.println("Сумму положительная");
        }
        if (c < 0) {
            System.out.println("Сумму отрицательная");
        }
    }
    public static void printColor() {
        int  printColor = 100;
        if (printColor <= 0) {
            System.out.println("Red");
        } else if (printColor > 0 && printColor <= 100) {
            System.out.println("Yellow");
        } else if (printColor > 100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int compareNumbersA = 51;
        int compareNumbersB = 55;
        if (compareNumbersA >= compareNumbersB) {
            System.out.println("A >= B");
        } else   {
            System.out.println("A < B");
        }
    }
}

