package Comand;

import org.telegram.telegrambots.api.objects.Message;

public class NoComand implements Comand{
    private  SendMessService sendMessService ;

    private static String mess;

    public NoComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }

    @Override
    public void execute(Message message) {
        ComandBox comandBox = new ComandBox(sendMessService);
        switch (message.getText()) {
            case "Регистрация": {

                comandBox.useComand("/reg").execute(message);
                break;
            }
            case "Тест": {

                comandBox.useComand("/test").execute(message);
                break;
            }
            case "Викторина": {

                comandBox.useComand("/victorina").execute(message);
                break;
            }
            case "STOP": {

                comandBox.useComand("/stop").execute(message);
                break;
            }

            default:
                mess = "Ипользуй помощь /help";
                sendMessService.send(message.getChatId().toString(),mess);

        }





    }




}
