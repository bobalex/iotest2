package it.testio.interfaces;

import java.io.OutputStream;

/**
 * Created by test on 29.04.16.
 */
public interface IMyOpenWrite {
    OutputStream openStream(String name) throws Exception;
}
