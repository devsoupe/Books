package code_3_final;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        final BankStatementAnalyzer1 bankStatementAnalyzer = new BankStatementAnalyzer1();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
