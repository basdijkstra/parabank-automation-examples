package unittest;

import java.util.Random;

public class LoanProcessor {

    public LoanProcessor() {
    }

    public String processLoanRequest() throws IllegalStateException {

        String[] results = {"Approved", "Denied", "Exception"};
        Random r = new Random();

        int randomIndex = r.nextInt(results.length);

        if(results[randomIndex].equalsIgnoreCase("Exception")) {
            throw new IllegalStateException();
        }

        return results[randomIndex];
    }
}