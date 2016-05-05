package it.testio.myReader;

import java.io.InputStream;

/**
 * This is interface for myReader.
 */
public interface IMyReader {
    /**
     * This is method for reading.
     * @return byte.
     */
    InputStream openStream(String name) throws Exception;
    byte[] myRead(InputStream inFile) throws Exception;
}
