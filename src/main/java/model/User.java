package model;

import java.time.LocalDateTime;
import java.util.Set;

public class User {
    private String name;
    private String email;
    private String password;
    private LocalDateTime registered;
    private boolean enabled;
    private Set<Role> roles;
}
