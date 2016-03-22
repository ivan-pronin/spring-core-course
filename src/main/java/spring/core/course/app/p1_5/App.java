package spring.core.course.app.p1_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    private Client client;
    private Event event;
    private IEventLogger eventLogger;

    public App()
    {
    }

    public App(Client client, IEventLogger eventLogger)
    {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) appContext.getBean("app");
        app.event = (Event) appContext.getBean("event");
        app.event.setMsg("Some event for client 1");
        app.eventLogger.logEvent(app.event);
        appContext.close();
    }
}
