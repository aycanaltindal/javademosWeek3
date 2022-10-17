package logging;

public class DatabaseLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Veritabanina eklendi : " + message);
    }
}
