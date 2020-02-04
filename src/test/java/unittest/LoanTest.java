package unittest;

import org.junit.*;

import static org.mockito.Mockito.*;

public class LoanTest {

    @Test
    public void addFivePercentInterest_checkAmount_shouldBe1050() {

        Loan loan = new Loan();

        loan.addInterest(0.05);

        Assert.assertEquals(1050, loan.getAmount());
    }

    @Test
    public void processApprovedLoan_checkResult_shouldBeSuccess() {

        Loan loan = new Loan();
        LoanProcessor mockLoanProcessor = mock(LoanProcessor.class);
        when(mockLoanProcessor.processLoanRequest()).thenReturn("Approved");

        String loanProcessingResult = loan.requestLoan(mockLoanProcessor);

        Assert.assertEquals("Success", loanProcessingResult);
    }

    @Test
    public void processDeniedLoan_checkResult_shouldBeFailure() {

        Loan loan = new Loan();
        LoanProcessor mockLoanProcessor = mock(LoanProcessor.class);
        when(mockLoanProcessor.processLoanRequest()).thenReturn("Denied");

        String loanProcessingResult = loan.requestLoan(mockLoanProcessor);

        Assert.assertEquals("Failure", loanProcessingResult);
    }
}
