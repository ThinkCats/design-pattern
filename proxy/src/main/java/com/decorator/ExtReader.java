package com.decorator;

/**
 * Created by wl on 2016/4/11.
 */
public class ExtReader implements Reader {
    private Reader reader;

    public ExtReader(Reader reader) {
        this.reader = reader;
    }

    public void readFile() {
        reader.readFile();
    }
}
