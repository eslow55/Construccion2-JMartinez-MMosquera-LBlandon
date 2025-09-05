package app.domain.model.entities;

public class Pet {

    private final String name;
    private final Person owner;
    private final String breed;
    private final String color;
    private final Species species;
    private float size;
    private float weight;
    private int petId;

    public Pet(String name, Person owner, String breed, String color, Species species) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.color = color;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public Species getSpecies() {
        return species;
    }

    public float getSize() {
        return size;
    }

    public float getWeight() {
        return weight;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.petId = id;
    }
    public int getId(){
        return this.petId;
    }
}
