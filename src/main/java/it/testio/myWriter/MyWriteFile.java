package it.testio.myWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */
public class MyWriteFile implements IMyWriter{
    public OutputStream openStream(String name) throws Exception{
        OutputStream outDesc = new FileOutputStream(new File(name));
        return outDesc;
    }
    public String myWrite(byte[] data, OutputStream streamDesc) throws Exception{
        streamDesc.write(data);
        return new String(data);
    }
}
