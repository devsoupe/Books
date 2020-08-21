package code_3_7;

import code_3_5.BankStatementProcessor;
import code_3_6.BankTransactionIsInFebruaryAndExpensive;
import code_3_starter.BankStatementParser;
import code_3_starter.BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyzer {

    private static final String RESOURCES = "src/main/resources";

    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLineFrom(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        final List<BankTransaction> transactions = bankStatementProcessor
                .findTransactions(new BankTransactionIsInFebruaryAndExpensive());
    }
}