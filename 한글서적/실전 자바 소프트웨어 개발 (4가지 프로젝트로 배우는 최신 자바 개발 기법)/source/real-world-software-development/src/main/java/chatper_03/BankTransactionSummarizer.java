package chatper_03;

@FunctionalInterface
interface BankTransactionSummarizer {

    double summarize(double accumlator, BankTransaction bankTransaction);
}

