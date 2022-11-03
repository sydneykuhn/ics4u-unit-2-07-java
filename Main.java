/*
* The program is an inheritance example.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2020-11-03
*
* This is a Vehicle program
*/

/**
 * This is the main CarStatus Class.
 * Class CarStatus
 */
final class Main {

    /**
    * This is 10.
    */
    public static final int TEN = 10;

    /**
    * This is 15.
    */
    public static final int FIFTEEN = 15;

    /**
     * This is newSpeed.
     */
    public static final String NEWSPEED = "New speed: ";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Bike bmx = new Bike("Red", 40);
        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("\nSet the cadence to 10");
        bmx.accelerate(TEN);
        bmx.status();

        System.out.println("\nAccelerate By 15:");
        bmx.accelerate(FIFTEEN);
        bmx.status();

        System.out.println("\nRing Bell.");
        bmx.ringBell();

        final Truck bigTruck = new Truck("Grey", "HGC-3456F", 200);
        System.out.println("\nCreated a Truck. \nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nApplied air pressure of 10:");
        bigTruck.provideAir(TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
