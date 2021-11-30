package Comand;

import App.DataBase;
import App.User;
import App.UserBox;
import org.telegram.telegrambots.api.objects.Message;


public class RegComand implements Comand{

    private  SendMessService sendMessService;
    private  String mess="Начнем Регистрацию в боте!";
    public RegComand(SendMessService sendMessService) {
        this.sendMessService = sendMessService;
    }
    private UserBox userBox=UserBox.userBox();
    @Override
    public void execute(Message message) {
        User user= userBox.getUser(message.getChatId().toString());
        if (user==null) {
            userBox.users.add(new User(message.getChatId().toString(), message.getFrom().getFirstName()));
            userBox.saveUsers(new DataBase());
        }
    /*

        int doReg;
        if (user==null)doReg=0;
        else doReg= user.doRegistration;

        switch (doReg) {
            case 1 : {
                mess = " ";
                user.doRegistration++;
                sendMessService.send(message.getChatId().toString(), mess);
                break;
            }
            case 2 :
            case 22 : {

                mess = "  ";
                user.doRegistration++;
                sendMessService.send(message.getChatId().toString(), mess);
                break;
            }
            case 3:
            case 33 : {

                    mess="";
                user.doRegistration++;
                sendMessService.send(message.getChatId().toString(), mess);


                break;
            }
            case 4 : {

                mess ="";

                sendMessService.send(message.getChatId().toString(), mess);
                user.doRegistration++;
                break;
            }
            case 5:{

                mess = "Регистрация завершена!";
                sendMessService.send(message.getChatId().toString(), mess);
                user.doRegistration = 0;
                userBox.saveUsers(new DataBase());
                System.out.println(user);

                break;
            }


            default : {

                user.doRegistration=1;
                StringBuilder name = new StringBuilder();
              //  ParseKurce.valutas.forEach(v->name.append(v.getName()).append("/"));
                mess = name + "=" + mess;
                sendMessService = new SendMessInline();
                sendMessService.send(message.getChatId().toString(), mess);
            }
        }*/
        }



    }

