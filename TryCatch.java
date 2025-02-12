import java.util.Scanner;

/**

* This VolSphere programs ask the user Radius then calculates the Sphere Volume.

*

* @author  Tony Tran

* @version 1.0

* @since   2025-02-12

*/

final class TryCatch {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(final String[] args) {
        /* Ask User the Radius */
        System.out.println("What is the Radius?");
        final Scanner s = new Scanner(System.in);
        final String radius = s.nextLine();
        try {
            /* Changes Users Radius into a Double. */
            final double doubleRadius = Double.parseDouble(radius);
            /* Checks if User's Radius is higher than 0' */
            if (doubleRadius <= 0) {
                /* Prints out Error */
                System.out.format("The Radius %.2f needs to be positive. \n",
                        doubleRadius);
            } else {
                /* Calculate the Sphere Volume */
                final double pi = Math.PI;
                final double spherePi = (4f / 3f) * pi;
                final double volumeSphere = spherePi * Math.pow(doubleRadius,
                        3f);
                /* Prints out the User Sphere Volume */
                System.out.format("The Sphere Volume is: %.2f \n",
                        volumeSphere);
            }
            /* Checks if the Users provided answer is a Letter */
        } catch (NumberFormatException error) {
            /* Prints out an Error */
            System.out.println("Enter a valid Radius. " + error.getMessage());
        }
    }
}
