package com.example.mvvmdemo.model;

import java.util.Observable;

public class DataModel extends Observable{
    private boolean changed =false;
    private String text="Hello world!";

    public boolean isChanged(){
        return changed;
    }

    public void setChanged(boolean status){
        changed=status;
    }

    public void setText(String newText){text=newText;super.setChanged();super.notifyObservers();/*changed=true;*/}

    public String getText(){
        return text;
    }
}