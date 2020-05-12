package inf.informatics;

        import java.util.Scanner;
        import java.util.Random;
public class Main {
    public static final int ELEMENT_NOT_FOUND = -1;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Въведи големина на масива:");
        int size = Integer.parseInt(scan.nextLine());
        int[] newArray = new int[size];

        arrayBoundaries(size);

        fillArray(newArray, size, scan);

        optionMenu();

        int commandNumber = Integer.parseInt(scan.nextLine());

        while (commandNumber != 12) {
            optionMethod(commandNumber, newArray,size);

            visualisation(newArray);

            optionMenu();

            commandNumber = Integer.parseInt(scan.nextLine());
        }
        System.out.println("BOOOOOOOM");



    }

    public static void arrayBoundaries(int size) {
        if (size < 1 || size > 100) {
            System.out.println("Големината на масива трябва да бъде между 1 и 100:");
            arrayBoundaries(size);
        }
    }

    public static void fillArray(int[] newArray, int size, Scanner scan) {
        System.out.println("Въведете елементите в масива(int):");
        for (int i = 0; i < size; i++) {
            newArray[i] = Integer.parseInt(scan.nextLine());
        }
    }

    public static void optionMenu() {

        System.out.println("Меню с опции");
        System.out.println("1. Сортиране на въведените числа във възходящ ред");
        System.out.println("2. Сортиране на въведените числа във низходящ ред");
        System.out.println("3. Търсене на позиция на конкретно число");
        System.out.println("4. разбъркване на числата");
        System.out.println("5. Изчисляване на сбора на всички числа ");
        System.out.println("6. Намиране на най-голямо число");
        System.out.println("7. Намиране на най-малко число");
        System.out.println("8. Намиране средно аритметично на числата");
        System.out.println("9. Проверка за симетричност на масива от числа");
        System.out.println("10. Обръщане на масива от числа");
        System.out.println("11. Визуализирай въведените числа");
        System.out.println("12. Изход");
        System.out.println("Изберете...");
    }

    public static void option_1(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
    }

    public static void option_2(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(array.toString());
    }

    public static void option_3_binarySearch(int[] array, int key) {
        boolean exist= false;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                exist = true;
                index = i;
                break;
            }
        }
        if (exist){
            System.out.printf("%d се намира на позиция %d",key,index+1);
            System.out.println();
        }
        else {
            System.out.printf("числото %d не е намерено", key);
            System.out.println();
        }
    }

    public static void option_4_randomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            swap(randomPosition, i, array);

        }
    }


    public static void swap(int firstPosition, int secondPosition, int[] array) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;

    }

    public static void option_5_sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("сборът е:" +sum);
    }

    public static void option_6_biggestNum(int[] array) {
        int max=-1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("Най-голямото число е:%d", max);
        System.out.println();
    }
    public static void option_7_SmallestNum(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }

        }
        System.out.printf("Най-малкото число е:%d", array[0]);
        System.out.println();
    }
    public static void option_8_average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double avrg;
        avrg = (double) total / array.length;
        System.out.println("Средният резултат е:" + avrg);
    }

    public static void option_9_simetriq(int[] array, int size) {
        boolean sim = true;
        for (int i = 0; i < size; i++) {
            size--;
            if (array[i] != array[size]) {
                sim = false;
            }
        }
        if (sim) {
            System.out.println("масивът е симетричен");

        } else {
            System.out.println("масивът не е симетричен");
        }
    }

    public static void option_10_razmqna(int[] array, int size) {
        int razmqna = 0;
        for (int j = size - 1, i = 0; j > i; j--, i++) {
            razmqna = array[j];
            array[j] = array[i];
            array[i] = razmqna;
        }
    }

    public static void visualisation(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void optionMethod(int num, int[] array, int size) {
        switch (num) {
            case 1:
                option_1(array);
                break;
            case 2:
                option_2(array);
                break;
            case 3:
                System.out.print("Въведи търсеното число: ");
                int desiredNumber = Integer.parseInt(scan.nextLine());
                option_3_binarySearch(array, desiredNumber);
                break;
            case 4:
                option_4_randomNumbers(array);
                break;
            case 5:
                option_5_sum(array);
                break;
            case 6:
                option_6_biggestNum(array);
                break;
            case 7:
                option_7_SmallestNum(array);
                break;
            case 8:
                option_8_average(array);
                break;
            case 9:
                option_9_simetriq(array,size);

                break;
            case 10:option_10_razmqna(array,size);

                break;
            case 11:
                visualisation(array);
                break;

        }
    }
}