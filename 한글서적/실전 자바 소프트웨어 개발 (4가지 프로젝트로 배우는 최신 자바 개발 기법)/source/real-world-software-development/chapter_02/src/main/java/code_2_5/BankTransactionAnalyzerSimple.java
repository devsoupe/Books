package code_2_5;

import code_2_3.BankStatementCSVParser;
import code_2_4.BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

import static code_2_6.BankTransactionAnalyzerSimple.calculateTotalAmount;
import static code_2_6.BankTransactionAnalyzerSimple.selectInMonth;

public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources";

    public static void main(String[] args) throws IOException {
        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

        final String fileName = args[0];
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFromCSV(lines);

        System.out.println("The total for all transactions is " + calculateTotalAmount(bankTransactions));
        System.out.println("Transactions in Janauary " + selectInMonth(bankTransactions, Month.JANUARY));
    }
}