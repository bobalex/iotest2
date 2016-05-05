package it.testio.openClass;

import it.testio.interfaces.IMyOpenRead;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

/**
 * Created by test on 29.04.16.
 */
public class MyOpenReadFile implements IMyOpenRead {
    public InputStream openStream(String name) throws Exception{
        InputStream inFile = new FileInputStream(new File(name));
        return inFile;
    }
}
