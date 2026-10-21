
import java.util.ArrayList;
import planet.moon.Phobos;

public class Team {
    private final String name;
    private final ArrayList<Astronaut> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void add(Astronaut astronaut) {
        this.members.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        this.members.remove(astronaut);
    }

    public int countMembers() {
        return this.members.size();
    }

    public void showMembers() {
        if (this.members.isEmpty()) {
            return;
        }

        System.out.print(this.name + ": ");

        for (int i = 0; i < this.members.size(); i++) {
            Astronaut astronaut = this.members.get(i);

            System.out.print(astronaut.getName());

            if (astronaut.getDestination() != null) {
                System.out.print(" on mission");
            } else {
                System.out.print(" on standby");
            }

            if (i < this.members.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(".");
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
    }

    public void doActions(chocolate.Mars mars) {
        for (Astronaut astronaut : this.members) {
            astronaut.doActions(mars);
        }
    }

    public void doActions(planet.Mars mars) {
        for (Astronaut astronaut : this.members) {
            astronaut.doActions(mars);
        }
    }

    public void doActions(Phobos phobos) {
        for (Astronaut astronaut : this.members) {
            astronaut.doActions(phobos);
        }
    }
}
