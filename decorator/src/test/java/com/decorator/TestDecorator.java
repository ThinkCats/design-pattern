package com.decorator;

import org.junit.Test;

/**
 * Created by wl on 2016/4/11.
 */
public class TestDecorator {

    @Test
    public void testCharacterReader(){
        Reader reader = new ByteReader();
        CharacterReader characterReader =new CharacterReader(reader);
        characterReader.readFile();
        //result:
        //This is byte type reader
        //This is Character Reader
    }

    @Test
    public void testFileReader(){
        Reader reader = new ByteReader();
        FileReader fileReader = new FileReader(reader);
        fileReader.readFile();
        //result:
        //This is byte type reader
        //This is File Reader
    }

    @Test
    public void testAllReader(){
        Reader reader = new ByteReader();
        CharacterReader characterReader = new CharacterReader(reader);
        FileReader fileReader = new FileReader(characterReader);
        fileReader.readFile();
        //result:
        //This is byte type reader
        //This is Character Reader
        //This is File Reader
    }
}
