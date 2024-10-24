package CodeForces;
import java.util.*;
public class ClockConversion1950C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Read the number of test cases
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            String time = scanner.nextLine(); // Read the time in "hh:mm" format
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            String minute = parts[1];

            String period;
            int convertedHour;

            if (hour == 0) {
                // 00:xx is 12:xx AM
                convertedHour = 12;
                period = "AM";
            } else if (hour >= 1 && hour <= 11) {
                // 01:xx to 11:xx remains the same and is AM
                convertedHour = hour;
                period = "AM";
            } else if (hour == 12) {
                // 12:xx is PM
                convertedHour = 12;
                period = "PM";
            } else {
                // 13:xx to 23:xx converts to 01:xx to 11:xx PM
                convertedHour = hour - 12;
                period = "PM";
            }

            // Format the hour to always have two digits (e.g., 01, 09, etc.)
            String formattedHour = String.format("%02d", convertedHour);

            // Print the converted time in "hh:mm AM/PM" format
            System.out.println(formattedHour + ":" + minute + " " + period);
        }

        scanner.close();
    }
}

