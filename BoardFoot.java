/*
 * This program calculates the length of a board foot.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2021-11-25
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class calculates the length of a board foot given the width and height.
 * */
final class BoardFoot {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function calculates the length of a board foot.
     *
     * @param width is the width inputted by the user.
     * @param height is the height inputter by the user.
     * @return the length of the board foot.
     * */
    private static double lengthCalculation(
        /**
        * This constant is the volume of board foot (144in³).
        * */
        public static final int BOARD_FOOT_VOL = 144;

        final double width, final double height) {
        return BOARD_FOOT_VOL / width / height;
    }

    /**
     * This function catches user input, validates and outputs the length of
     * the board foot.
     *
     * @param args Not used.
     *
     * @throws NumberFormatException if there are any problems while parsing
     *     the user input to a Double.
     * @throws IOException if there is any problem with the input.
     * */
    public static void main(final String[] args) {

        double width = 0;
        double height = 0;
        double length = 0;

        System.out.println("This program figures out the length of a wooden"
                             + " board that is 1 board in dimension.");
        System.out.println("(1 board foot is 144 inches³ of wood.)\n");

        try {
            // Input
            System.out.print("Enter a width(inch): ");

            final String widthString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            width = Double.parseDouble(widthString);

            // Input
            System.out.print("Enter a height(inch): ");

            final String heightString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            height = Double.parseDouble(heightString);

            length = lengthCalculation(width, height);

            System.out.println("\nThe wood should be " + length + " inch(es)"
                                   + " long.");
        } catch (IOException | NumberFormatException exception) {
            // Error check
            System.out.println("Please enter a correct input.\n");
        }

        System.out.println("\nDone.");
    }

}
