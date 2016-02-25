package spring.core.course.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App()
    {
    }

    public App(Client client, ConsoleEventLogger eventLogger)
    {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args)
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) appContext.getBean("app");
        app.logEvent("Some event for client 1");
        app.logEvent("Some event for client 2");
    }

    private void logEvent(String msg)
    {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
