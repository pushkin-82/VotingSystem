package votingSystem.model;

import java.util.Set;

public class Restaurant extends AbstractEntity {

    private String name;

    public Restaurant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
