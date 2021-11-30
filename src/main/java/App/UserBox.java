package App;


import java.util.HashSet;
import java.util.Set;


public class UserBox {

    private static UserBox userBox;
    public static UserBox userBox() {
       if(userBox==null) userBox=new UserBox();
       return userBox;
    }


    public  Set<User> users=new HashSet<>();

    public  User getUser(String idUser){
        User user=null;
        try {
            user = (User) users.stream().filter(u -> u.getChatId().equals(idUser)).toArray()[0];
        }catch (Exception e){

        }
        return  user;
    }
    public  void openUsers(UserList uL){
        if (uL.users()==null) System.out.println("User List not found!");
        else {
            users = uL.users();
            System.out.println("Users=" + users.size());
        }
    }
    public void saveUsers(UserList uL){
         uL.saveUserList(users);
    }
    public  void deleteUser(User user, UserList uL){
        uL.deletUser(user);
    }




}
