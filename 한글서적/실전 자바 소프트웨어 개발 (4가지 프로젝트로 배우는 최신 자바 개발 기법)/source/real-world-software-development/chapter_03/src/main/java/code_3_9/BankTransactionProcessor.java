package code_3_9;

import code_3_4.BankTransactionFilter;
import code_3_starter.BankTransaction;

import java.util.List;

// for build error
class Category {

}

public interface BankTransactionProcessor {

    double calculateTotalAmount();

    double calculateTotalInMonth();

    double calculateTotalInJanauary();

    double calculateAverageAmount();

    double calculateAverageAmountForCategory(Category category);

    List<BankTransaction> findTransactions(BankTransactionFilter bankTransactionFilter);
}
