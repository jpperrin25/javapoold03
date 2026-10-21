
import planet.moon.Phobos;

public class Astronaut {
    private static int nextId = 0;

    private final String name;
    private final int id;
    private int snacks;
    private String destination;

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

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        showSnackMessage();
    }

    public void doActions(planet.Mars mars) {
        System.out.println(this.name + ": Started a mission!");
        this.destination = mars.getLandingSite();
        showSnackMessage();
    }

    public void doActions(chocolate.Mars mars) {
        System.out.println(this.name + ": Thanks for this Mars number " + mars.getId());
        this.snacks++;
        showSnackMessage();
    }

    public void doActions(Phobos phobos) {
        System.out.println(this.name + ": Started a mission!");
        this.destination = phobos.getLandingSite();
        showSnackMessage();
    }

    private void showSnackMessage() {
        if (this.destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }
}
