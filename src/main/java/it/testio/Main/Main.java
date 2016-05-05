package it.testio.Main;
import it.testio.closeClass.CloseStreamIn;
import it.testio.closeClass.CloseStreamOut;
import it.testio.interfaces.*;
import it.testio.openClass.MyOpenReadFile;
import it.testio.openClass.MyOpenReadString;
import it.testio.openClass.MyOpenWriteFile;
import it.testio.openClass.MyOpenWriteString;
import it.testio.outputClass.MyOutputStream;
import it.testio.readerClass.MyReaderStream;
import it.testio.transformerClass.TransformStream;
import it.testio.writeClass.MyWriteFile;
import it.testio.writeClass.MyWriteString;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){

        InputStream descInStream;
        OutputStream descOutStream;

        String tmp = "";
        byte[] tmpBytes;

        IMyOpenRead testFileOpenRead = new MyOpenReadFile();
        IMyOpenWrite testFileOpenWrite = new MyOpenWriteFile();
        IMyWriter testFileWrite = new MyWriteFile();
        IMyReader testFileRead = new MyReaderStream();
        IMyTransformer testFileTrans = new TransformStream();

        IMyOpenRead testStringOpenRead = new MyOpenReadString();
        IMyOpenWrite testStringOpenWrite = new MyOpenWriteString();
        IMyWriter testStringWrite = new MyWriteString();
        IMyReader testStringRead = new MyReaderStream();
        IMyTransformer testStringTrans = new TransformStream();

        try {
            //open
            descInStream = testFileOpenRead.openStream("/home/test/project_java/homework_io_git/src/test.txt");
            descOutStream = testFileOpenWrite.openStream("1.txt");

            //read,transform,write
            tmpBytes = testFileRead.myRead(descInStream);

            tmp = testFileWrite.myWrite(testFileTrans.transformStream(tmpBytes), descOutStream);

            //print
            //MyOutputStream.printFile(tmpBytes);
            //System.out.println(tmp);

            //Close
            CloseStreamIn.closeStream(descInStream);
            CloseStreamOut.closeStream(descOutStream);
        }catch(java.io.FileNotFoundException e){
            System.out.print("File not found");
        }catch (Exception e) {
            System.out.print("Problem");
        }


        try {
            //open
            descInStream = testStringOpenRead.openStream("1.txt\n");
            descOutStream = testStringOpenWrite.openStream(tmp);

            //read,transform,write
            tmpBytes = testStringRead.myRead(descInStream);

            tmp = testStringWrite.myWrite(tmpBytes, descOutStream);

            //print
            //System.out.println(tmp);

            //Close
            CloseStreamOut.closeStream(descOutStream);
            CloseStreamIn.closeStream(descInStream);
        }catch (Exception e){
            System.out.print("Problem");
        }

    }
}
