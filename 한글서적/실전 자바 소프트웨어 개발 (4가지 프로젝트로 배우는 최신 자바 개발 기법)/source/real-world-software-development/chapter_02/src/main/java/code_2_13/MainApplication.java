package code_2_13;

import code_2_11.BankStatementCSVParser;
import code_2_11.BankStatementParser;
import code_2_12.BankStatementAnalyzer;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
