package code_2_11;

import code_2_4.BankTransaction;

import java.util.List;

public interface BankStatementParser {

    BankTransaction parseFrom(String line);

    List<BankTransaction> parseLineFrom(List<String> lines);
}
