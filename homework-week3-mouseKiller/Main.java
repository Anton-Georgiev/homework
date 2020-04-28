package inf.informatics;
import java.util.Random;
import java.util.Scanner;
public class Main {
public static int attackCount=0;
	public static int robotTalk = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter object in front of robot: ");

			String object = scan.nextLine();

			while(!object.equals("stop")) {
				RobotTalk();
				CheckCommand(object);

				try {
					CheckPixels(Integer.parseInt(object));
				} catch (NumberFormatException e) {
					System.out.println();
				}

				object = scan.nextLine();
			}
	}
	public static void CheckCommand(String command){
		if ("chair".equals(command)) {
			System.out.println("Jump!");
		}
		else if ("wall".equals(command)) {
			System.out.println("Go sideways");
		}

		else if ("none".equals(command)) {
			System.out.println("Forward");
		}
	}

	public static void RandomNumGenerator(){
		Random rand = new Random();
	int randNum = 1+rand.nextInt(10);
		if (randNum == 5){
			System.out.println("Hit the furniture!");
		}
		System.out.println("Random num is: " + randNum);

	}

	public static void CheckPixels(int pixels) {
		if (pixels % 2 == 0) {
			attackCount++;
			System.out.println("Target located!- BOOM");
			RandomNumGenerator();
		}
		else if (pixels % 2 == 1){
			System.out.println("nqma mishka!");
		}
		if (attackCount == 4){
			System.out.println("Preparing to charge.");
			Charge();
			attackCount =0;
		}

	}
	public static void Charge(){
		Random rand = new Random();

		int num1 = 1+rand.nextInt(1000);
		int num2 = 1+rand.nextInt(1000);

		if (num1 > num2){
			System.out.println("Charging..");
		}
		else if (num2 > num1){
			System.out.println("No power!");
		}
		//else (num1 == num2){

	}
	public static void RobotTalk(){
		robotTalk--;
		System.out.println(robotTalk);

		if (robotTalk % 2 == 0){
			System.out.println("I am a robottt");
		}
		if (robotTalk == 0){
			robotTalk = 10;
		}
	}
}

