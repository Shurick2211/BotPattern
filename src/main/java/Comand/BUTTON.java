package Comand;

import App.UserBox;
import org.telegram.telegrambots.api.objects.Message;

public class BUTTON implements Comand{
    private final SendMessService sendMessService;
    private UserBox userBox=UserBox.userBox();
    private String mess="";

    public BUTTON(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        if (userBox.getUser(message.getChatId().toString())==null){
            mess="Регистрация";
        }else {
            mess="Изменить/Изменить /STOP";

        }

        sendMessService.send(message.getChatId().toString(),mess);
    }
}
