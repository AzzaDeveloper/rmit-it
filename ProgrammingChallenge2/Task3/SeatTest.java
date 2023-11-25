package Task3;
public class SeatTest {
    public static void main(String[] args) {
        /**
         * Sample code has been provided as as starting point to test your
         * implementation.
         * 
         * IMPORTANT: This code will not compile until you write the classes being
         * instantiated here.
         * You may modify this code for faster testing purposes and exploration, but
         * your assessment is through the use of unit tests, so you need to ensure that
         * the
         * classes you write comply with the requirements setout in the documentation.
         * 
         * Adding undocumented public methods to your Seat, RegularSeat & PremiumSeat
         * classes
         * may mean that the unit tests fail as our testing code will be unaware of your
         * new
         * methods and therefore cannot call those methods.
         */

        // UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR
        // IMPLEMENTATION

        System.out.println("Creating seats with valid values: D2 and A1");
        RegularSeat regularSeat = new RegularSeat("D", 2, "L");
        PremiumSeat premiumSeat = new PremiumSeat("A", 1, "R");
        System.out.println(regularSeat.getSeatIdentifier());
        System.out.println(premiumSeat.getSeatIdentifier());

        // // Should be converted to upper case row identifier
        System.out.println("\nCreating seats with valid values: d2 and a1");
        regularSeat = new RegularSeat("d", 2, "L");
        premiumSeat = new PremiumSeat("a", 1, "R");
        System.out.println(regularSeat.getSeatIdentifier());
        System.out.println(premiumSeat.getSeatIdentifier());

        // // Should have number error
        System.out.println("\nShould have number error: A33 and A0");
        regularSeat = new RegularSeat("A", 33, "L");
        premiumSeat = new PremiumSeat("A", 0, "R");
        System.out.println(regularSeat.getSeatIdentifier());
        System.out.println(premiumSeat.getSeatIdentifier());

        // // Should not be booked
        System.out.println("\nCheck status of unbooked seats");
        regularSeat = new RegularSeat("D", 2, "L");
        premiumSeat = new PremiumSeat("A", 1, "R");
        System.out.println(regularSeat.isBooked());
        System.out.println(premiumSeat.isBooked());

        // // Should return false as the seats have not yet been booked.
        System.out.println("\nCancel booking should fail as seats are unbooked");
        boolean regularCancelSucessful = regularSeat.cancelBooking();
        boolean premiumCancelSucessful = premiumSeat.cancelBooking();
        System.out.println("Result: " + regularCancelSucessful);
        System.out.println("Result: " + premiumCancelSucessful);

        System.out.println("\nBook seat should succeed as seats are unbooked");
        // // Status should change to booked.
        regularSeat.bookSeat();
        premiumSeat.bookSeat();
        System.out.println(regularSeat.isBooked());
        System.out.println(premiumSeat.isBooked());

        System.out.println("\nCancel booking should succeed as seats are booked");
        // // Status should change to unbooked.
        regularCancelSucessful = regularSeat.cancelBooking();
        premiumCancelSucessful = premiumSeat.cancelBooking();
        premiumSeat.cancelBooking();
        System.out.println(regularCancelSucessful);
        System.out.println(premiumCancelSucessful);

        System.out.println("\nTesting toString");
        // // Status should change to unbooked.
        regularSeat = new RegularSeat("D", 2, "L");
        premiumSeat = new PremiumSeat("A", 1, "R");
        System.out.println(regularSeat);
        System.out.println(premiumSeat);

        System.out.println("\nTesting equals method");
        // // Status should change to unbooked.
        regularSeat = new RegularSeat("D", 2, "L");
        RegularSeat regularSeat2 = new RegularSeat("D", 2, "L");
        RegularSeat regularSeat3 = new RegularSeat("D", 2, "R");
        premiumSeat = new PremiumSeat("A", 1, "R");
        System.out.println(regularSeat.equals(regularSeat));
        System.out.println(regularSeat.equals(regularSeat2));
        System.out.println(regularSeat2.equals(regularSeat3));
        System.out.println(premiumSeat.toString());
    }
}
