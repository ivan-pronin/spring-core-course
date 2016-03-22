package spring.core.course.app.p1_4;

public class ConsoleEventLogger implements EventLogger
{

    public void logEvent(Event event)
    {
        System.out.println(event);
    }
}
