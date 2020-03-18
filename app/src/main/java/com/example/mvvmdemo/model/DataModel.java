package com.example.mvvmdemo.model;

import java.util.Observable;

public class DataModel extends Observable{
    private String text="Hello world!";

    public void setText(String newText){
        text=newText;
        super.setChanged();
        super.notifyObservers();
    }

    public String getText(){
        return text;
    }
}