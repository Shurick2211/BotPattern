package App;


import java.util.logging.Logger;

public class Main {

    public static void main(String [] args) {
        Logger logger=Logger.getAnonymousLogger();
        //read users
        UserBox userBox=UserBox.userBox();
       // UserBox.openUsers(new DataBase());
        userBox.users.forEach(System.out::println);
        //запуск бота
        Bot.bot();


    }
}
