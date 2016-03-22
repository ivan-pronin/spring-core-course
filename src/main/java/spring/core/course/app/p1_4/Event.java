package spring.core.course.app.p1_4;

import java.text.DateFormat;
import java.util.Date;

public class Event
{
    private final int id;
    private static int counter;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df)
    {
        this.date = date;
        this.df = df;
        id = counter++;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "Event [id=" + id + ", msg=" + msg + ", date=" + df.format(date) + "]";
    }

}
