package permissions.db;

import java.util.List;

import org.hsqldb.rights.User;
import permissions.domain.Person;

public interface UserRepository extends Repository<User> {

    public List<User> withname(String name, PagingInfo page);
    public List<User> withpassword(String password, PagingInfo page);
}