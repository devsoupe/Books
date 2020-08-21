package code_3_17;

import code_3_starter.BankStatementParser;
import code_3_starter.BankTransaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser {

    // for build error
    private static final int EXPECTED_ATTRIBUTES_LENGTH = 3;
    private static class CSVSyntaxException extends Throwable {
        public CSVSyntaxException() { }
    }

    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public BankTransaction parseFrom(String line) {
        final String[] columns = line.split(",");

        if (columns.length < EXPECTED_ATTRIBUTES_LENGTH) {
            // for build error
            //throw new CSVSyntaxException();
        }

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransaction(date, amount, description);
    }

    @Override
    public List<BankTransaction> parseLineFrom(List<String> lines) {
        final List<BankTransaction> bankTransactions = new ArrayList();
        for (final String line : lines) {
            bankTransactions.add(parseFrom(line));
        }
        return bankTransactions;
    }
}
