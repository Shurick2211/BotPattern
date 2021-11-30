package Comand;

public enum ComandName {
    START("/start"),
    TEST("/test"),
    VICTORINA("/victorina"),
    STOP("/stop"),
    REG("/reg"),
    HELP("/help"),
    BUTTON("BUTTON"),
    NO("NO");

    private final String comandName;

    ComandName(String comandName) {
        this.comandName=comandName;
    }
    public String getComandName(){
        return comandName;
    }
}
