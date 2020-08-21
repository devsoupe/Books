package code_3_final;

@FunctionalInterface
interface BankTransactionSummarizer {

    double summarize(double accumlator, BankTransaction bankTransaction);
}

