import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.List;


public class PrintJob {
    private Printer printer;
    private List<Job> lastPrintedJobs;

    @Given("printer")
    public void thePrinterIsReady() {
        printer = new Printer();
    }

    @When("user sends $pages pages to the printer")
    public void sendJobToPrinter(int pages) {
        printer.sendJob(new Job(pages));
    }

    @Then("$jobs job with $pages pages appears on printer display")
    public void checkPrinter(int jobs, int pages) {
        Assert.assertEquals(printer.getJobs().size(), jobs);
        Assert.assertEquals(printer.getPages(), pages);
    }

    @When("user push print button")
    public void printJobs() {
        lastPrintedJobs = printer.printJobs();
    }

    @Then("$pages are printed for $price dollars")
    public void accountJobs(int pages, int price) {
        Assert.assertEquals(countPages(lastPrintedJobs), pages);
        Assert.assertEquals(countPages(lastPrintedJobs) * 2 + lastPrintedJobs.size(), price);
    }

    public static int countPages(List<Job> jobs) {
        int pages = 0;
        for (Job job : jobs)
            pages += job.getPages();
        return pages;
    }
}
