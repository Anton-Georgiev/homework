package inf.informatics;

import static inf.informatics.NumberOption.*;

public class OptionsPrint {
    public static void mainMenu() {
        String mainOptionMenu = "Главно меню с опции:\n" +
                "1. Работа с числа\n" +
                "2. Работа с думи\n" +
                "3. Изход от програмата";
        System.out.println(mainOptionMenu);
    }

    public static void printNumberOption(){
        String numberOp = "Меню с опции:\n" +
                "1. Извеждане само на простите числа от масива\n" +
                "2. Извеждане на най-често срещан елемент в масива\n" +
                "3. Извеждане на максимална редица от нарастващи елементи в масива\n" +
                "4. Извеждане на максимална редица от намаляващи елементи в масива\n" +
                "5. Извеждане на максимална редица от еднакви елементи в масива\n" +
                "6. Извеждане на последователност от числа от масива, които имат сума\n" +
                "равна на число, генерирано на случаен принцип\n" +
                "7. Връщане назад към основното меню";
        System.out.println(numberOp);
    }

    public static void chooseMainOption(int num){
        switch (num){
            case 1:
                NumberOption.arraySize();

                NumberOption.createArrayAndAddElements(NumberOption.arraySize());

                printNumberOption();

                       int numberOption = scan.nextInt();

                       switch (numberOption){
                           case 1: NumberOption.option1PrintProstiChisla(createArrayAndAddElements(NumberOption.arraySize()));
                               break;
                           case 2:
                               break;
                           case 3:
                               break;
                           case 4:
                               break;
                           case 5:
                               break;
                           case 6:
                               break;
                           case 7:
                               break;
                       }
                break;
            case 2:
                WordOption.numberOfWords();
                WordOption.fillWords();

                break;
            case 3:

                break;
        }
    }
}

