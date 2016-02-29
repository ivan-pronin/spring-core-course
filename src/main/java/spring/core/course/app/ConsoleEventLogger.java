package spring.core.course.app;

public class ConsoleEventLogger implements EventLogger
{

    public void logEvent(Event event)
    {
        System.out.println(event);
    }
}
