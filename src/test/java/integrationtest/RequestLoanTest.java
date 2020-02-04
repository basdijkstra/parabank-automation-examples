package integrationtest;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RequestLoanTest {

    @Test
    public void requestLoanWithInsufficientFunds_CheckStatusCodeAndApproval_ShouldReturn200AndFalse() {

        given().
            queryParam("customerId","12212").
            queryParam("amount","10000").
            queryParam("downPayment","10").
            queryParam("fromAccountId","12345").
            accept(ContentType.JSON).
        when().
            post("http://parabank.parasoft.com/parabank/services/bank/requestLoan").
        then().
            assertThat().
            statusCode(200).
        and().
            body("approved", equalTo(false));
    }
}
