package code_3_19;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class BankStatementValidator {

    private String description;
    private String date;
    private String amount;

    public BankStatementValidator(String description, String date, String amount) {
        this.description = Objects.requireNonNull(description);
        this.date = Objects.requireNonNull(date);
        this.amount = amount;
    }

    public boolean validate() {
        if (this.description.length() > 100) {
            throw new IllegalArgumentException();
        }

        final LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(this.date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid format for date", e);
        }
        if (parsedDate.isAfter(LocalDate.now())) throw new IllegalArgumentException("date cannot be in the future");

        try {
            Double.parseDouble(this.amount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid format for amount", e);
        }
        return true;
    }
}
