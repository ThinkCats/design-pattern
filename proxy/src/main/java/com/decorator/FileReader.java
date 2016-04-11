package com.decorator;

/**
 * Created by wl on 2016/4/11.
 */
public class FileReader extends ExtReader {

    public FileReader(Reader reader) {
        super(reader);
    }

    @Override
    public void readFile(){
        super.readFile();
        System.out.println("This is File Reader ");
    }
}
