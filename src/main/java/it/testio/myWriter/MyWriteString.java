package it.testio.myWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */

public class MyWriteString implements IMyWriter{

    public OutputStream openStream(String name) throws Exception{
        OutputStream outDesc = new ByteArrayOutputStream();
        return outDesc;
    }

    public String myWrite(byte[] data, OutputStream streamDesc) throws Exception{
        streamDesc.write(data);
        return streamDesc.toString();
    }
}
