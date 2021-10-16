import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int yourOperationNum = 0;
            int yourFirstNum = 0;
            int yourSecondNum = 0;
            int num = 0;

            Scanner in = new Scanner(System.in);

            System.out.println("Choose your operation to numbers");
            System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
            yourOperationNum = in.nextInt();

            System.out.println("Enter two numbers");
            yourFirstNum = in.nextInt();
            yourSecondNum = in.nextInt();

            switch(yourOperationNum) {
                case 1:
                    num = yourFirstNum + yourSecondNum;
                    System.out.println("Your number = " + num);
                    break;
                case 2:
                    num = yourFirstNum - yourSecondNum;
                    System.out.println("Your number = " + num);
                    break;
                case 3:
                    num = yourFirstNum * yourSecondNum;
                    System.out.println("Your number = " + num);
                    break;
                case 4:
                    num = yourFirstNum / yourSecondNum;
                    System.out.println("Your number = " + num);
                    break;
                default:
                    System.out.println("Unexpected number");
            }
            in.close();
    }


}
