package it.testio.openClass;
import it.testio.interfaces.IMyOpenWrite;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;

/**
 * Created by test on 29.04.16.
 */
public class MyOpenWriteString implements IMyOpenWrite{
    public OutputStream openStream(String name) throws Exception{
        OutputStream outDesc = new ByteArrayOutputStream();
        return outDesc;
    }
}
