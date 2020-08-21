package code_3_18;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class OverlySpecificBankStatementValidator {

    // for build error
    private static class DescriptionTooLongException extends RuntimeException { }
    private static class InvalidDateFormat extends RuntimeException { }
    private static class DateInTheFutureException extends RuntimeException { }
    private static class InvalidAmountException extends RuntimeException { }

    private String description;
    private String date;
    private String amount;

    public OverlySpecificBankStatementValidator(String description, String date, String amount) {
        this.description = Objects.requireNonNull(description);
        this.date = Objects.requireNonNull(date);
        this.amount = amount;
    }

    public boolean validate()
            throws DescriptionTooLongException, InvalidDateFormat, DateInTheFutureException, InvalidAmountException {

        if (this.description.length() > 100) {
            throw new DescriptionTooLongException();
        }

        final LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(this.date);
        } catch (DateTimeParseException e) {
            throw new InvalidDateFormat();
        }
        if (parsedDate.isAfter(LocalDate.now())) throw new DateInTheFutureException();

        try {
            Double.parseDouble(this.amount);
        } catch (NumberFormatException e) {
            throw new InvalidAmountException();
        }

        return true;
    }
}
