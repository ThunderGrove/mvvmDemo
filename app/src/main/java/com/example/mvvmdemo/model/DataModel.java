package com.example.mvvmdemo.model;

public class DataModel{
    private boolean changed =false;
    private String text="Hello world!";

    public boolean isChanged(){
        return changed;
    }

    public void setChanged(boolean status){
        changed=status;
    }

    public void setText(String newText){text=newText;changed =true;}

    public String getText(){
        return text;
    }
}