package cleancode.srp.violate;

public interface Modem {
    void dial(String pno);
    void hangup();
    void send(char c);
    char recv();
}
