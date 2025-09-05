
package app.domain.services;

import app.domain.model.entities.Users;
import app.domain.ports.PersonPort;
import app.domain.ports.UserPort;

public class CreateUserService {

    private final UserPort userPort;
    private final PersonPort personPort;

    public CreateUserService(app.domain.ports.UserPort userPort, PersonPort personPort) {
        this.userPort = userPort;
        this.personPort = personPort;
    }

    public void createUser(Users user) throws Exception {

        if (this.userPort.findUserByName(user.getName()) != null) {
            throw new Exception("user already exists");
        }
        if (this.personPort.findPersonById(user.getPerson().getId()) == null) {
            throw new Exception("account is not assciated with a person");
        }
        this.userPort.saveUser(user);
    }

}
