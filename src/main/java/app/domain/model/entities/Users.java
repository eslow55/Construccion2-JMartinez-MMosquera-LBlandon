package app.domain.model.entities;

public class Users {

    private final Person person;
    private String name;
    private String username;
    private String password;
    private Role role;

    public Users(Person person) {
        this.person = person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Person getPerson() {
        return this.person;
    }

}
