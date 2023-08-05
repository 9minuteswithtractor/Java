
import java.util.Scanner;

import service.Calculation;

public class Main {

    /** BOBSAYS: code a simple calculation-app
     *
     *  [x] takes user input (whole numbers or string "end")
     *  [x] converts user input to number
     *  [x] calculate and display cubed number
     *  [x] quit application when user enters "end"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculation calculation = new Calculation();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }

            int convertedNumber = calculation.convertStringToInt(input);
            int result = calculation.calculateCube(convertedNumber);
            System.out.println(result);

        }

        scan.close();

    }
}
