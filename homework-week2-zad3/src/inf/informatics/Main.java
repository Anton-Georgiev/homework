package inf.informatics;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floorNum;
        System.out.println("Enter floor number:");
        floorNum = scan.nextInt();

        switch (floorNum) {
            case 8:
                floorNum = 8;
                System.out.println("Здравей, Мими!");
                break;
            case 7:
                floorNum = 7;
                System.out.println("здравей, Яни!");
                break;
            case 6:
                floorNum = 6;
                System.out.println("здравей, Веси!");
                break;
            case 5:
                floorNum = 5;
                System.out.println("здравей, Пепи!");
                break;
            case 4:
                floorNum = 4;
                System.out.println("здравей, Плами!");
                break;
            case 3:
                floorNum = 3;
                System.out.println("здравей, Дани!");
                break;
            case 2:
                floorNum = 2;
                System.out.println("здравей, Фани!");
                break;
            case 1:
                floorNum = 1;
                System.out.println("здравей, Клари!");
                break;
            case 0:
                floorNum = 0;
                System.out.println("Ябааааа!");
        }
    }

}