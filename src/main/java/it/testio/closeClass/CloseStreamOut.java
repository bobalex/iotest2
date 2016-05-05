package it.testio.closeClass;
import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */
public class CloseStreamOut {
    public static void closeStream(OutputStream descStream) throws Exception{
            descStream.close();
    }

}
