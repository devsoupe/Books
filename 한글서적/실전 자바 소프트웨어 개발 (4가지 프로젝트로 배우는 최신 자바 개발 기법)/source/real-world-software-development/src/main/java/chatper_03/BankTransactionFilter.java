package chatper_03;

@FunctionalInterface
public interface BankTransactionFilter {

    boolean test(BankTransaction bankTransaction);
}


