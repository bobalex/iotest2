package it.testio.myWriter;


import java.io.OutputStream;

/**
 *This is interface for Writer.
 */
public interface IMyWriter {
    /**
     * This is method of myWiter.
     * @param
     */
    OutputStream openStream(String name) throws Exception;
    String myWrite(byte[] data, OutputStream streamDesc) throws Exception;

}
