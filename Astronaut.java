
public class Astronaut {
    private static int nextId = 0;

    private final String name;
    private final int id;
    private final int snacks;
    private final String destination;

    public Astronaut(String name) {
        this.name = name;
        this.id = nextId++;
        this.snacks = 0;
        this.destination = null;

        System.out.println(this.name + " ready for launch!");
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getSnacks() {
        return this.snacks;
    }

    public String getDestination() {
        return this.destination;
    }
}
