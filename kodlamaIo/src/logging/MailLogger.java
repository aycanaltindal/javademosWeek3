package logging;

public class MailLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("Mail atildi : " + message);
    }
}
