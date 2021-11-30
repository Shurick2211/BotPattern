package Comand;

import org.telegram.telegrambots.api.objects.Message;

public class TestComand implements Comand{
    private final SendMessService sendMessService;
    private final String mess="Тестирование!";

    public TestComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        sendMessService.send(message.getChatId().toString(),mess);
    }
}
