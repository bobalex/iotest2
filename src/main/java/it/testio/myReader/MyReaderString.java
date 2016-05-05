package it.testio.myReader;

import it.testio.myWriter.IMyWriter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by test on 05.05.16.
 */
public class MyReaderString implements IMyReader{
    public byte[] myRead(InputStream inFile) throws Exception{
        byte[] tmp = new byte[inFile.available()];
        inFile.read(tmp, 0, inFile.available());
        return tmp;
    }
    public InputStream openStream(String name) throws Exception{
        InputStream inFile = new ByteArrayInputStream(name.getBytes());
        return inFile;
    }
}
