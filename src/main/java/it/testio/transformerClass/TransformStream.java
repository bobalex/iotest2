package it.testio.transformerClass;
import org.apache.commons.lang.StringUtils;
import it.testio.interfaces.IMyTransformer;

/**
 * Created by test on 29.04.16.
 */
public class TransformStream implements IMyTransformer {
    public byte[] transformStream(byte[] inStream){
        byte[] tmpOut;
        String tmpOutString = "";
        byte tmp;
        int openSym = 0;

        for(int i = 0; i < inStream.length; i++){
            if ((String.valueOf((char)inStream[i]).equals(" ")) &&
                    ((String.valueOf((char)inStream[i-1]).equals(" ")) ||
                            (String.valueOf((char)inStream[i+1]).equals(" ")
                            ))) {
                tmpOutString = tmpOutString + " "; //Nothing do
            }else if ((String.valueOf((char)inStream[i]).equals(";"))) {
                tmpOutString = tmpOutString+String.valueOf((char)inStream[i])+"\n"+StringUtils.repeat(" ", openSym);
            }else if ((String.valueOf((char)inStream[i]).equals("{"))){
                openSym = openSym + 4;
                tmpOutString = tmpOutString+String.valueOf((char)inStream[i])+"\n"+StringUtils.repeat(" ", openSym);
            }else if ((String.valueOf((char)inStream[i]).equals("}"))){
                openSym = openSym - 4;
                tmpOutString = tmpOutString+String.valueOf((char)inStream[i])+"\n"+StringUtils.repeat(" ", openSym);
            }else if((String.valueOf((char)inStream[i]).equals("=")) ||
                    (String.valueOf((char)inStream[i]).equals("+")) ||
                    (String.valueOf((char)inStream[i]).equals("-")) ||
                    (String.valueOf((char)inStream[i]).equals("*")) ||
                    (String.valueOf((char)inStream[i]).equals("/"))){
                tmpOutString = tmpOutString + " " + String.valueOf((char) inStream[i])+" ";
            }else{
                tmpOutString = tmpOutString + String.valueOf((char) inStream[i]);
            }
        }

        return tmpOutString.getBytes();
    }
}
