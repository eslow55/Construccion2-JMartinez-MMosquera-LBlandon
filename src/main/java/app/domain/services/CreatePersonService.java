
package app.domain.services;

import app.domain.model.entities.Person;
import app.domain.ports.PersonPort;


public class CreatePersonService {

    private final PersonPort personPort;

    public CreatePersonService(PersonPort personPort) {
        this.personPort = personPort;
    }
    
    public void createPerson(Person person) throws Exception{
        if(this.personPort.findPersonById(person.getId()) != null){
            throw new Exception("Already Exists a person with this id");
        }
        this.personPort.savePerson(person);
    }

}
