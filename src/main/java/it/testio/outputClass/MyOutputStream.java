package it.testio.outputClass;

import java.util.Arrays;

/**
 * Created by test on 28.04.16.
 */
public class MyOutputStream {
    public static void printFile(byte[] masFileByte){
        for(int i = 0; i < masFileByte.length; i++){
            System.out.print((char)masFileByte[i]);
        }
    }
}
