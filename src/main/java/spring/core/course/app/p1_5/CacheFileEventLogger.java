package spring.core.course.app.p1_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger
{
    private int cacheSize = 10;
    private List<Event> cache = new ArrayList<>();

    public CacheFileEventLogger(String fileName)
    {
        super(fileName);
    }

    public CacheFileEventLogger(String fileName, int cacheSize) {
		super(fileName);
		this.cacheSize = cacheSize;
	}

	@Override
    public void logEvent(Event event)
    {
        cache.add(event);
        if (cache.size() == cacheSize)
        {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy()
    {
        writeEventsFromCache();
    }
    
    protected void init() throws IOException
    {
    	super.init();
    }

    private void writeEventsFromCache()
    {
        for (Event e : cache)
        {
            super.logEvent(e);
        }
    }
}
