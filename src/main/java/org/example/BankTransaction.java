package org.example;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.ZonedDateTime;


public class BankTransaction {

    public void performTransaction() throws Exception {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the transfer amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character

        // Get user's region
        System.out.println("Select your region:");
        System.out.println("1. America");
        System.out.println("2. Europe");
        int regionChoice = scanner.nextInt();
        scanner.close();

        // Calculate time of transaction
        ZoneId zoneId;
        switch (regionChoice) {
            case 1:
                zoneId = ZoneId.of("America/New_York");
                break;
            case 2:
                zoneId = ZoneId.of("Europe/London");
                break;
            default:
                throw new IllegalArgumentException("Invalid region choice.");
        }
        ZonedDateTime transactionTime = ZonedDateTime.now(zoneId);

        // Format name using initials
        String initials = firstName.charAt(0) + ".";
        String senderName = initials + lastName.charAt(0) + ".";

        // Print check
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = formatter.format(transactionTime);
        System.out.println("===== TRANSACTION CHECK =====");
        System.out.println("Time: " + formattedTime);
        System.out.println("Amount: $" + amount);
        System.out.println("Sender: " + senderName);
    }
}

