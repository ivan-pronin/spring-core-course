package spring.core.course.app;

import java.sql.Date;

public class Event
{

    private final int id;
    private static int counter;
    private String msg;
    private Date date;
    
    public Event(Date date)
    {
        this.date = date;
        id = counter++;
    }
            
}
