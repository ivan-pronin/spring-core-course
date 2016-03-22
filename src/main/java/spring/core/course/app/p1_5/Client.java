package spring.core.course.app.p1_5;

public class Client
{

    private String id;
    private String fullName;

    public Client(String id, String fullName)
    {
        this.id = id;
        this.fullName = fullName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getId()
    {
        return id;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Client [id=" + id + ", fullName=" + fullName + "]";
    }

}
