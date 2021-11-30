package Comand;

import org.telegram.telegrambots.api.objects.Message;

public class VictorinaComand implements Comand{
    private final SendMessService sendMessService;
    private final String mess="Ура! Викторина!";

    public VictorinaComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        sendMessService.send(message.getChatId().toString(),mess);
    }
}
