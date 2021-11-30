package App;

import java.util.Set;

public interface UserList {

     Set<User> users();
     void saveUserList(Set<User> users);
     void deletUser(User user);
}
