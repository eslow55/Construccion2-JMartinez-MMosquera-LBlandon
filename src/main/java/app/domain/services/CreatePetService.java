
package app.domain.services;


import app.domain.model.entities.Pet;
import app.domain.ports.PersonPort;
import app.domain.ports.PetPort;


public class CreatePetService {

    private final PetPort petPort;
    private final PersonPort personPort;

    public CreatePetService(app.domain.ports.PetPort petPort, PersonPort personPort) {
        this.petPort = petPort;
        this.personPort = personPort;
    }

    public void createPet(Pet pet) throws Exception {

        if (this.personPort.findPersonById(pet.getOwner().getId()) == null) {
            throw new Exception("pet is expected to has a valid owner");
        }
        this.petPort.savePet(pet);
    }
}
