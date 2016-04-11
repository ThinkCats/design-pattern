package com.decorator;

/**
 * Created by wl on 2016/4/11.
 */
public class CharacterReader extends ExtReader {
    public CharacterReader(Reader reader) {
        super(reader);
    }

    @Override
    public void readFile() {
        super.readFile();
        System.out.println("This is Character Reader ");
    }
}
