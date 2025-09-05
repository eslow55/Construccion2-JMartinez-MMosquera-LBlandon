
package app.domain.ports;
import app.domain.model.entities.Pet;

public interface PetPort {    
    public Pet findPetById(int petId);
    public void savePet(Pet pet);
}
