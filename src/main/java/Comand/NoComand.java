package Comand;

import org.telegram.telegrambots.api.objects.Message;

public class NoComand implements Comand{
    private final SendMessService sendMessService;
    private static String mess;

    public NoComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        switch (message.getText()) {
            case "Регистрация": {
                ComandBox comandBox = new ComandBox(sendMessService);
                comandBox.useComand("/reg").execute(message);
                break;
            }

            case "STOP": {
                ComandBox comandBox = new ComandBox(sendMessService);
                comandBox.useComand("/stop").execute(message);
                break;
            }

            default:
                mess = "Ипользуй помощь /help";

        }


        sendMessService.send(message.getChatId().toString(),mess);


    }




}
