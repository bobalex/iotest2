package it.testio.writeClass;
import it.testio.interfaces.IMyWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/**
 * Created by test on 29.04.16.
 */
public class MyWriteFile implements IMyWriter{
    public String myWrite(byte[] data, OutputStream streamDesc) throws Exception{
        streamDesc.write(data);
        return new String(data);
    }
}
