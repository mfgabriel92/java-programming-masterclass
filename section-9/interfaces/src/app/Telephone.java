package app;

public interface Telephone {
    void powerOn();
    void dial(String number);
    void answer();
    boolean isRinging();    
}