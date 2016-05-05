package it.testio.Main;
import it.testio.closeClass.CloseStreamIn;

import it.testio.closeClass.CloseStreamOut;
import it.testio.myReader.*;
import it.testio.myReader.MyReaderFile;
import it.testio.myTransformer.IMyTransformer;
import it.testio.myTransformer.TransformStream;
import it.testio.myWriter.IMyWriter;
import it.testio.myWriter.MyWriteFile;
import it.testio.myWriter.MyWriteString;
import it.testio.outputClass.MyOutputStream;


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


        IMyReader testFileRead = new MyReaderFile();
        IMyWriter testFileWrite = new MyWriteFile();
        IMyTransformer testTransform = new TransformStream();

        IMyReader testStringRead = new MyReaderString();
        IMyWriter testStringWrite = new MyWriteString();

        try {
            //open
            descInStream = testFileRead.openStream("/home/test/project_java/homework_io_git2/src/test2.txt");
            descOutStream = testFileWrite.openStream("1.txt");

            //read,transform,write
            tmpBytes = testFileRead.myRead(descInStream);

            tmp = testFileWrite.myWrite(testTransform.transformStream(tmpBytes), descOutStream);

            //print
            MyOutputStream.printFile(tmpBytes);
            System.out.println(tmp);

            //Close
            CloseStreamIn.closeStream(descInStream);
            CloseStreamOut.closeStream(descOutStream);
        }catch(java.io.FileNotFoundException e){
            e.printStackTrace();
            System.out.print("File not found");
        }catch (Exception e) {
            System.out.print("Problem");
        }


        try {
            //open
            descInStream = testStringRead.openStream("1.txt\n");
            descOutStream = testStringWrite.openStream(tmp);

            //read,transform,write
            tmpBytes = testStringRead.myRead(descInStream);

            tmp = testStringWrite.myWrite(testTransform.transformStream(tmpBytes), descOutStream);

            //print
            System.out.println(tmp);

            //Close
            CloseStreamOut.closeStream(descOutStream);
            CloseStreamIn.closeStream(descInStream);
        }catch (Exception e){
            System.out.print("Problem");
        }

    }
}
