package HomeWorkApp;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        int[] arr = {1,0,0,1,1,0,0,1,1};
        printarr("1. Before:\t", arr);
        change (arr);
        printarr("1. After;\t", arr);
        System.out.println("****************");

        int[] arr2 = new int [100];
        fillIn(arr2);
        printarr("2. Result:\t", arr2);
        System.out.println("*****************");

        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        printarr("3. Before: \t", arr3);
        doubl(arr3);
        printarr("3. After:\t", arr3);
        System.out.println("*****************");


        int side = 10;
        int[][] arr4 = new int[side][side];
        cross(arr4);
        printarr1("4. Result ", arr4);
        System.out.println("*****************");

        int[] returnArrMetod = returnArr5(10, 999);
        printarr("5. ReturnArr", returnArrMetod);
        System.out.println("*****************");

    }

    private static void printarr1(String s, int[][] arr4) {
        System.out.println(s);
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++) {
            System.out.print(arr4[i][j] + " ");
        }
        System.out.println();
        }
    }


    private static void printarr(String s, int[] arr) {
        System.out.print(s + ": ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i ++)
         if (arr[i] == 1)  {
            arr[i] = 0 ;
        } else {
             arr[i] = 1;
         }
    }
    private static void fillIn(int[] arr2) {
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i + 1;
            }

    private static void doubl(int[] arr3) {
        for (int i = 0; i < arr3.length; i++)
            if (arr3[i] < 6)
                arr3[i] *=2;
    }
    private static void cross(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }
    }

    public static int[] returnArr5(int len, int initvalue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
        tempArray[i] = initvalue;        }
        return tempArray;
    }
}
