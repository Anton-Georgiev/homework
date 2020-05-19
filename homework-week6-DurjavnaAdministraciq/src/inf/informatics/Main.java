package inf.informatics;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		OptionsPrint.mainMenu();

		System.out.println("Изберете опция:");
		int option = scan.nextInt();
		OptionsPrint.chooseMainOption(option);


    }

}

