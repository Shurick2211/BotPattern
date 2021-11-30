package Comand;


import com.google.common.collect.ImmutableMap;

import static Comand.ComandName.BUTTON;
import static Comand.ComandName.*;

public class ComandBox {
    private UnknowComand unknowComand;

    private ImmutableMap<String, Comand> comandMap;

    public ComandBox(SendMessService sendMessService) {
        comandMap= ImmutableMap.<String,Comand>builder()
                .put(START.getComandName(), new StartComand(sendMessService))
                .put(TEST.getComandName(), new TestComand(sendMessService))
                .put(VICTORINA.getComandName(), new VictorinaComand(sendMessService))
                .put(REG.getComandName(), new RegComand(sendMessService))
                .put(HELP.getComandName(), new HelpComand(sendMessService))
                .put(NO.getComandName(), new NoComand(sendMessService))
                .put(BUTTON.getComandName(), new BUTTON(sendMessService))
                .put(STOP.getComandName(), new StopComand(sendMessService))
                .build();
        unknowComand=new UnknowComand(sendMessService);

    }
    public Comand useComand(String ideficator){
        return comandMap.getOrDefault(ideficator, unknowComand);
    }
}