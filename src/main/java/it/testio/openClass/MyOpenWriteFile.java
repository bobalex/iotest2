package it.testio.openClass;
import it.testio.interfaces.IMyOpenWrite;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */
public class MyOpenWriteFile implements IMyOpenWrite{
    public OutputStream openStream(String name) throws Exception{
        OutputStream outDesc = new FileOutputStream(new File(name));
        return outDesc;
    }
}
