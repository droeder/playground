package com.steadforce.main;

public class Main {

    public boolean doSome(boolean b) {
        return b;
    }

    public void doFail() {
        throw new RuntimeException("failed");
    }
}
