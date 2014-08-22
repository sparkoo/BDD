package bdd;

public class Job {
    private final int id;
    private final int pages;

    public Job(int id, int pages) {
        this.id = id;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "jobid: " + id + "pages: " + pages;
    }
}
