package App;

import java.io.Serializable;

public class User implements Serializable {
    private String chatId;

    public transient int doRegistration=0;

    public User(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String toString() {
        return "User{" +
                "chatId='" + chatId + '\'' +
                '}';
    }
}
