package Comand;

import App.DataBase;
import App.UserBox;
import org.telegram.telegrambots.api.objects.Message;

public class StopComand implements Comand{
    private final SendMessService sendMessService;
    private final String mess="Вы отписались от рассылки!";
    private UserBox userBox=UserBox.userBox();
    public StopComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        sendMessService.send(message.getChatId().toString(),mess);
        userBox.deleteUser(userBox.getUser(message.getChatId().toString()), new DataBase());
        userBox.users.remove(userBox.getUser(message.getChatId().toString()));


    }
}
