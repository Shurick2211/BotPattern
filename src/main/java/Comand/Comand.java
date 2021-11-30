package Comand;

import org.telegram.telegrambots.api.objects.Message;

public interface Comand {

    void execute(Message message);
}
