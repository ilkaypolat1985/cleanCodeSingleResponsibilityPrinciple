package cleancode.srp.refactor;

public interface DataChannel {
    void send(char character);
    char recv();
}
