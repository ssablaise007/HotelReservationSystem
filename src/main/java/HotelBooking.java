import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  CLass for Hotel booking
 */

public class HotelBooking<hotelList> {

    public static HashMap<String,Hotel> listOfHotels = new HashMap<>();

        // Main method

        public static void main(String[] args) {
            System.out.println("Welcome to Hotel Reservation System");

        }

        public void add(String hotelName, int rateRegular, int regularWeekend) {
            Hotel hotel = new Hotel(hotelName,rateRegular,regularWeekend);
            listOfHotels.put(hotelName,hotel);
        }
    }

