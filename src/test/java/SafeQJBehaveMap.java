import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import bdd.SafeQ;

public class SafeQJBehaveMap {
    private SafeQ safeQ;
    private String lastDisplayMessage;

    @Given("SafeQ")
    public void thePrinterIsReady() {
        safeQ = new SafeQ();
    }

    @When("user checks display")
    public void sendJobToPrinter() {
        lastDisplayMessage = safeQ.getDisplayMessage();
    }

    @Then("display should look like $message")
    public void checkPrinter(String message) {
        Assert.assertEquals(lastDisplayMessage, message);
    }

    @When("user sends $pages pages to SafeQ")
    public void sendJob(int pages) {
        safeQ.receiveJob(pages);
    }

    @When("user prints all jobs")
    public void printAll() {
        safeQ.printAll();
    }

    @Then("printed pages on SafeQ is $pages")
    public void printedPages(int pages) {
        Assert.assertEquals(pages, safeQ.getPrintedPagesCounter());
    }
}
