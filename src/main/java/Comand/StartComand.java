package Comand;

import App.UserBox;
import org.telegram.telegrambots.api.objects.Message;

public class StartComand implements Comand{
    private final SendMessService sendMessService;
    private UserBox userBox=UserBox.userBox();
    private String mess="Вас приветствует бот!\n" +
            "Вам надо зарегистрироваться" +

            "\nЗарегистрироваться можно кнопкой внизу или командой /reg";

    public StartComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        if(userBox.getUser(message.getChatId().toString())==null){
            mess="Привет!";
            ComandBox comandBox = new ComandBox(sendMessService);
            comandBox.useComand("/reg").execute(message);
        }

        else mess="Привет! Вы наш клиент!";
        sendMessService.send(message.getChatId().toString(),mess);

    }
}
