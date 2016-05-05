package it.testio.transformerClassTest;
import it.testio.closeClass.CloseStreamIn;
import it.testio.closeClass.CloseStreamOut;
import it.testio.interfaces.*;
import it.testio.openClass.MyOpenReadString;
import it.testio.openClass.MyOpenWriteString;
import it.testio.readerClass.MyReaderStream;
import it.testio.transformerClass.TransformStream;
import it.testio.writeClass.MyWriteString;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by test on 30.04.16.
 */
public class TransformStreamStringTest {
    @Before
    public void setUp(){
        ;
    }

    @Test
    public void transformStreamTest(){
        String correctString = "";
        InputStream descInStream;
        OutputStream descOutStream;
        byte[] tmpBytes;
        String tmp = "";

        IMyOpenRead testStringOpenRead = new MyOpenReadString();
        IMyOpenWrite testStringOpenWrite = new MyOpenWriteString();
        IMyWriter testStringWrite = new MyWriteString();
        IMyReader testStringRead = new MyReaderStream();
        IMyTransformer testStringTrans = new TransformStream();

        try {
            //open
            descInStream = testStringOpenRead.openStream("");
            descOutStream = testStringOpenWrite.openStream(tmp);

            //read,transform,write
            tmpBytes = testStringRead.myRead(descInStream);

            tmp = testStringWrite.myWrite(tmpBytes, descOutStream);

            CloseStreamOut.closeStream(descOutStream);
            CloseStreamIn.closeStream(descInStream);

        }catch (Exception e){
            System.out.println("Error");
        }
        //print
        //System.out.println(tmp);

        //Close

        assertEquals("Error: the values does not equal", correctString,tmp);
    }

}
