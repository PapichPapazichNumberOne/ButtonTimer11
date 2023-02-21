import org.example.BankTransaction;
import org.junit.Test;

public class BankTransactionTest {

    @Test
    public void testPerformTransaction() throws Exception {
        BankTransaction bankTransaction = new BankTransaction();
        bankTransaction.performTransaction();
    }
}
