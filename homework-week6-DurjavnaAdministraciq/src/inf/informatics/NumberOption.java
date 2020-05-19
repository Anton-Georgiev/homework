package inf.informatics;


import java.util.Scanner;

    public class NumberOption {
    static Scanner scan = new Scanner(System.in);

    public static int arraySize(){
        System.out.println("Въведете големината на масива:");
        int arrSize = scan.nextInt();
        return arrSize;
    }

    public static int[] createArrayAndAddElements(int arrSize){
        int[] arr = new int[arrSize];
        System.out.println("Въведете елементите на масива като те трябва да са между 0 и 10 000: ");
        for (int i = 0; i < arrSize; i++){
            if  (arr[i] < 0 || arr[i] > 10000){
                System.out.println("Въведения елемент не покрива изискванията!");
            }
            else  {
                arr[i] = scan.nextInt();
            }

        }
        return arr;
    }

    public static void option1PrintProstiChisla(int[] arr){
        for (int i = 0; i < arr.length; i++){
            isNaive(i);

            if(isNaive(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isNaive(int n){
        if (n < 2)
            return false;
        for (int i =2; i <= n/2; i++){
            if (n % 2 ==0)
                return false;
        }
        return true;
    }
}
