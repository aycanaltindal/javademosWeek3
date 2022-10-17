package logging;

public class FileLogger implements Logger {


    @Override
    public void logMessage(String message) {
        System.out.println("Dosyaya loglandi : " + message);

    }
}
