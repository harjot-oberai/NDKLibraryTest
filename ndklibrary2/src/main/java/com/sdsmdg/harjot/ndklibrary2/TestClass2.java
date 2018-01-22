package com.sdsmdg.harjot.ndklibrary2;

/**
 * Created by Harjot on 22-Jan-18.
 */

public class TestClass2 {

    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();
}
