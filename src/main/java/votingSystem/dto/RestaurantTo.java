package votingSystem.dto;

import votingSystem.model.Dish;

import java.util.Set;

public class RestaurantTo {
    private Integer id;
    private String name;
    private Set<Dish> menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Dish> getMenu() {
        return menu;
    }

    public void setMenu(Set<Dish> menu) {
        this.menu = menu;
    }
}
