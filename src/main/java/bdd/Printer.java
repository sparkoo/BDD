package bdd;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Printer {
    private final Logger log = LogManager.getLogger(Printer.class);
    public int printJob(Job job) {
        for (int i = 1; i <= job.getPages(); i++) {
            log.info("printing page " + i + " of job " + job.getId());
        }
        return job.getPages();
    }
}
