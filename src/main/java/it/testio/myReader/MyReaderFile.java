package it.testio.myReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import it.testio.myReader.IMyReader;

/**
 * Created by test on 28.04.16.
 */
public class MyReaderFile implements IMyReader{
    public byte[] myRead(InputStream inFile) throws Exception{
        byte[] tmp = new byte[inFile.available()];
        inFile.read(tmp, 0, inFile.available());
        return tmp;
    }

    public InputStream openStream(String name) throws Exception{
        InputStream inFile = new FileInputStream(new File(name));
        return inFile;
    }
}
