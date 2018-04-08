import java.util.Scanner;

/**
 * Created by Swagmaster on 2017-04-07.
 */
public class MaximumFinder {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Skriv in tre värden");

    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    int result = maximum(number1, number2, number3);

    System.out.println("högsta värdet är : " + result);

    }

    private static int maximum(int number1, int number2, int number3) {
        int maximumValue = number1;

        if (number2 > maximumValue){
            maximumValue = number2;
        }
        if (number3 > maximumValue){
            maximumValue = number3;
        }

        return maximumValue;
    }
}
