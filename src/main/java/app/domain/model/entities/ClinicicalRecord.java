package app.domain.model.entities;

public class ClinicicalRecord {

    private final Pet pet;
    private final Users veterinarian;
    private int recordId;

    public ClinicicalRecord(Pet pet, Users veterinarian) {
        this.pet = pet;
        this.veterinarian = veterinarian;
    }

    public int getRecordId() {
        return this.recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Users getVeterinarian() {
        return this.veterinarian;
    }

    public Pet getPet() {
        return this.pet;
    }
}
