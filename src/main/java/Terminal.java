import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private final List<Job> jobs;
    private final Printer printer;

    public Terminal(Printer printer) {
        jobs = new ArrayList<>();
        this.printer = printer;
    }

    public void printJobs() {
        printer.print(jobs);
        jobs.clear();
    }

    public void receiveJob(Job job) {
        jobs.add(job);
    }

    public int getJobCount() {
        return jobs.size();
    }
}
