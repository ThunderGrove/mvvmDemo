package com.example.mvvmdemo.model;

public class DataModel {
    private String text="Hello world!";

    public void setText(String newText){
        text=newText;
    }

    public String getText(){
        return text;
    }
}