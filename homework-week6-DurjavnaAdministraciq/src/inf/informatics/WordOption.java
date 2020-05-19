package inf.informatics;
import java.util.Scanner;

public class WordOption {
    private static Scanner scan;

    public static int numberOfWords(){
        System.out.println("Въведете броя на думите:");

        int wordNum = scan.nextInt();
        return wordNum;
    }

    public static void fillWords (){
        String[] wordArr = new String[numberOfWords()];
        System.out.println("въведи думите");
       for (int i =0; i <numberOfWords(); i++){
           wordArr[i] = scan.nextLine();
       }
    }
}
