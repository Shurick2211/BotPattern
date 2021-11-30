package App;

import java.io.Serializable;

public class User implements Serializable {
    private String chatId;
    private String firstName;
    public transient int doRegistration=0;



    public User(String chatId, String firstName) {
        this.chatId = chatId;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
