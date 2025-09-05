
package app.domain.ports;
import app.domain.model.entities.Person;

public interface PersonPort {
    public Person findPersonById(int personId);
    public void savePerson(Person person);
}
