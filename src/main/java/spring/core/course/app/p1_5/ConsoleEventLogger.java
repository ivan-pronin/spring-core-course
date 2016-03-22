package spring.core.course.app.p1_5;

public class ConsoleEventLogger implements IEventLogger
{
    public void logEvent(Event event)
    {
        System.out.println(event);
    }
}
