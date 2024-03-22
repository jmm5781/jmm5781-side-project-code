package com.techelevator.hotels;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {

   // This is static so it will be shared among all instance and can be used to generate the next id
    private static int nextId = 100;

    /*
        TODO

        You should be able to create a reservation from a list of arguments for all the member
        properties except id.

        The id will automatically be set to the value returned by getNextId()

        ------

        You should also be able to create a reservation with no parameters.

        When creating with no parameters the id should still be set using getNextId()


     */

    /*
        TODO 1

        create member properties for:

        id (int)
        name (String)
        phone (String)
        email (String)
        checkInDate (LocalDate)
        checkOutDate (LocalDate)
        numberOfGuests (int)
     */


    /*
        TODO
        create getters and setters for all the member properties

        the id will be set when creating the Reservation and external code should
        not be able to update it once it is set
     */


    public int getNextId() {
        // this is an instance where nextId is returned and THE incremented
        return nextId++;
    }

    /*
        TODO

        make sure we can compare Reservations based on the data rather than on the
        memory address
     */

    /*
        TODO
        make sure the code will print the actual data rather than the memory address when it is printed
     */

}
