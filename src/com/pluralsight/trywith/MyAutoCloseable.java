package com.pluralsight.trywith;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable{
    public void saySomething() throws IOException{
        System.out.println("something");
    }
    @Override
    public void close() throws Exception {
        throw new IOException("Exception from close")
        //System.out.println("Close");
    }
}
