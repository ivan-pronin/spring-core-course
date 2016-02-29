package spring.core.course.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    private Client client;
    private Event event;
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
        app.event = (Event) appContext.getBean("event");
        app.event.setMsg("Some event for client 1");
        app.eventLogger.logEvent(app.event);
    }
}
