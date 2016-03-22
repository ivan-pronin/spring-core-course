package spring.core.course.app.p1_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

public class FileEventLogger implements IEventLogger
{
    private String fileName;
    private File file;

    public FileEventLogger(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void logEvent(Event event)
    {
        try
        {
            FileUtils.writeStringToFile(file, event.toString(), true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    protected void init() throws IOException
    {
        Path p = Paths.get(fileName);
        if (Files.exists(p))
        {
            Files.delete(p);
        }
        try
        {
            file = Files.createFile(p).toFile();
            if (!file.canWrite())
            {
                throw new IOException("Cannot write to file: " + fileName);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error occured while creating a file: " + e.getMessage());
        }

    }

}
