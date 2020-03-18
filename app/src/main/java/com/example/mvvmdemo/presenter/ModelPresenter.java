package com.example.mvvmdemo.presenter;

import com.example.mvvmdemo.model.DataModel;

import java.util.Observable;

public class ModelPresenter extends Observable{
    DataModel dataModel=new DataModel();
    String modelPresenter="";

    public ModelPresenter(){
        observePresenter();
    }

    public void updateModel(String s){
        dataModel.setText(s);
        super.setChanged();
        super.notifyObservers();
    }

    public void observePresenter(){
        dataModel.addObserver(
                (o, arg)->modelPresenter=dataModel.getText().toLowerCase()
        );
    }

    public String getModel(){
        return modelPresenter;
    }
}
