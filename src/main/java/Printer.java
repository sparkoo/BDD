import java.util.ArrayList;
import java.util.List;

public class Printer {
    private final List<Job> jobs;

    public Printer() {
        jobs = new ArrayList<>();
    }

    public void sendJob(Job job) {
        jobs.add(job);
    }

    public List<Job> printJobs() {
        List<Job> printedJobs = new ArrayList<>(jobs);
        jobs.clear();
        return printedJobs;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public int getPages() {
        int pages = 0;
        for (Job job : jobs)
            pages += job.getPages();
        return pages;
    }
}
