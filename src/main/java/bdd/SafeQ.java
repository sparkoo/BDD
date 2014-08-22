package bdd;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeQ {
    private final Printer printer;
    private final AtomicInteger jobIdGenerator = new AtomicInteger(1);
    private final Queue<Job> jobQueue = new ArrayDeque<Job>();
    private int printedPagesCounter = 0;

    public SafeQ() {
        printer = new Printer();
    }

    public void receiveJob(int pages) {
        jobQueue.add(new Job(jobIdGenerator.getAndIncrement(), pages));
    }

    public void printAll() {
        while (!jobQueue.isEmpty()) {
            printedPagesCounter += printer.printJob(jobQueue.remove());
        }
    }

    public int getPrintedPagesCounter() {
        return printedPagesCounter;
    }

    public String getDisplayMessage() {
        if (jobQueue.isEmpty()) {
            return "queue is empty";
        } else {
            return "you have " + jobQueue.size() + " jobs in queue";
        }
    }
}
