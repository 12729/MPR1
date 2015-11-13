package permissions.db;

import permissions.domain.Person;

import java.util.List;
import permissions.domain.Role;

/**
 * Created by LouL on 2015-11-13.
 */
public interface RoleRepository extends Repository<Role>{
    public List<Person> withId(int id, PagingInfo page);
    public List<Person> withname(String name, PagingInfo page);

}



