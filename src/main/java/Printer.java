import java.util.List;

public class Printer {
    private final Terminal terminal;

    public Printer() {
        terminal = new Terminal(this);
    }

    public void print(List<Job> jobs) {

    }

    public Terminal getTerminal() {
        return terminal;
    }
}
