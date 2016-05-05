package it.testio.readerClass;
import java.io.BufferedInputStream;
import java.io.InputStream;

import it.testio.interfaces.IMyReader;

/**
 * Created by test on 28.04.16.
 */
public class MyReaderStream implements IMyReader{
    public byte[] myRead(InputStream inFile) throws Exception{
        byte[] tmp = new byte[inFile.available()];
        inFile.read(tmp, 0, inFile.available());
        return tmp;
    }
}
