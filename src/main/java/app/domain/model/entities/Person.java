package app.domain.model.entities;

public class Person {

    private final int personId;
    private String name;
    private int edad;

    public Person(int personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public int getId(){
        return this.personId;
    }
}
