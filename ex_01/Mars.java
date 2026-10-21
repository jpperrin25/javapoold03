
public class Mars {
    private static int nextId = 0;
    private final int id;

    public Mars() {
        this.id = nextId++;
    }

    public int getId() {
        return this.id;
    }
}
