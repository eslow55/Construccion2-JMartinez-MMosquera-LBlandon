
package app.domain.ports;
import app.domain.model.entities.Users;

public interface UserPort {
    public Users findUserByName(String userName);
    public void saveUser(Users user);
}
