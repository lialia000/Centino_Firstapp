import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NameAndDateTime {
    public static void main(String[] args) {
       
        String fullName = "Li-an Kristin J. Centino"; 
        System.out.println("Li-an Kristin J. Centino " + fullName);

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("2025-02-03 3:25:10");
        String formattedDateTime = now.format(formatter);

        // Print current date and time
        System.out.println("Febuary 03, 2025 3:25 " + formattedDateTime);
    }
}