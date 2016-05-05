package it.testio.writeClass;
import it.testio.interfaces.IMyWriter;

import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */
public class MyWriteString implements IMyWriter{
    public String myWrite(byte[] data, OutputStream streamDesc) throws Exception{
        streamDesc.write(data);
        return streamDesc.toString();
    }
}
