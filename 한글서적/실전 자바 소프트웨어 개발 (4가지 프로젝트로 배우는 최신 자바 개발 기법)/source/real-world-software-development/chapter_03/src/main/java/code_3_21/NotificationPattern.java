package code_3_21;

import code_3_20.Notification;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class NotificationPattern {

    private String description;
    private String date;
    private String amount;

    public NotificationPattern(String description, String date, String amount) {
        this.description = Objects.requireNonNull(description);
        this.date = Objects.requireNonNull(date);
        this.amount = amount;
    }

    public Notification validate() {
        final Notification notification = new Notification();

        if (this.description.length() > 100) {
            notification.addError("The description is too long");
        }

        final LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(this.date);
            if (parsedDate.isAfter(LocalDate.now())) {
                notification.addError("date cannot be in the future");
            }
        } catch (DateTimeParseException e) {
            notification.addError("Invalid format for date");
        }

        final double amount;
        try {
            amount = Double.parseDouble(this.amount);
        } catch (NumberFormatException e) {
            notification.addError("Invalid format for amount");
        }

        return notification;
    }
}
