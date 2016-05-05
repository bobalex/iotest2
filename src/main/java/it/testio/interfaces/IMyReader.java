package it.testio.interfaces;

import java.io.InputStream;

/**
 * This is interface for myReader.
 */
public interface IMyReader {
    /**
     * This is method for reading.
     * @return byte.
     */
    byte[] myRead(InputStream inFile) throws Exception;
}
