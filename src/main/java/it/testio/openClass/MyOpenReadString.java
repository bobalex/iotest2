package it.testio.openClass;

import it.testio.interfaces.IMyOpenRead;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * Created by test on 29.04.16.
 */
public class MyOpenReadString implements IMyOpenRead {
    public InputStream openStream(String name) throws Exception{
        InputStream inFile = new ByteArrayInputStream(name.getBytes());
        return inFile;
    }
}
