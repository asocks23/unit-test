package org.zzia.info.junit.lesson04;

public class StubbingService {

    public String getS(){
        throw new UnsupportedOperationException();
    }

    public int getI(){
        return 10 ;
    }
}
