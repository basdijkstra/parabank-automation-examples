package unittest;

public class Loan {

    private int amount = 1000;
    private String description = "New car loan";

    public Loan() {
    }

    public String requestLoan(LoanProcessor loanProcessor) {
        try {
            return loanProcessor.processLoanRequest().equalsIgnoreCase("Approved") ? "Success" : "Failure";
        }
        catch(Exception e) {
            return "Exception occurred at payment provider when trying to checkout";
        }
    }

    public void addInterest(double interestRate) {
        this.amount *= (1 + interestRate);
    }

    public int getAmount() {
        return this.amount;
    }
}
