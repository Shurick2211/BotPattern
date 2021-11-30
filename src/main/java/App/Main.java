package App;




public class Main {

    public static void main(String [] args) {

        //read users
        UserBox userBox=UserBox.userBox();
        userBox.openUsers(new DataBase());
        userBox.users.forEach(System.out::println);
        //запуск бота
        Bot.bot();


    }
}
