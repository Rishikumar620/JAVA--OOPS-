import java.util.ArrayList;
import java.util.List;
class Booking {
    String date, startTime, endTime, name;

    Booking(String date, String startTime, String endTime, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }
}
public class Book{
    private static final List<Booking> bookings = new ArrayList<>();

    public static String bookRoom(String date, String startTime, String endTime, String name) {
        for (Booking b : bookings) {
            if (b.date.equals(date) && b.startTime.equals(startTime) && b.endTime.equals(endTime)) {
                return "Room is already booked.";
            }
        }
        bookings.add(new Booking(date, startTime, endTime, name));
        return "Booking successful for " + name;
    }
    public static String checkAvailability(String date, String startTime, String endTime) {
        for (Booking b : bookings) {
            if (b.date.equals(date) && b.startTime.equals(startTime) && b.endTime.equals(endTime)) {
                return "Room is not available.";
            }
        }
        return "Room is available.";
    }
    public static void main(String[] args) {
        System.out.println(bookRoom("2024-08-01", "10:00", "12:00", "Rishi"));
        System.out.println(checkAvailability("2024-08-01", "10:00", "12:00"));
        System.out.println(checkAvailability("2024-08-01", "14:00", "16:00"));
    }
}