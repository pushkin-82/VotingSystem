package votingSystem.model;

public class Restaurant extends AbstractBaseEntity {

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
