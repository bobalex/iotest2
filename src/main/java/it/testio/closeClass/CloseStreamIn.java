package it.testio.closeClass;

import java.io.InputStream;

/**
 * Created by test on 28.04.16.
 */
public class CloseStreamIn {
    public static void closeStream(InputStream descStream) throws Exception{
        descStream.close();
    }
}
