package com.example.mvvmdemo.view;

import com.example.mvvmdemo.model.DataModel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmdemo.R;

public class MainActivity extends AppCompatActivity{
    EditText editText;
    TextView label;
    Button button;

    DataModel dataModel=new DataModel();

    //Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observePresenter();
        editText=(EditText)findViewById(R.id.editText);
        label=(TextView)findViewById(R.id.label);
        button=(Button)findViewById(R.id.button);

        /*int delay=200;

        handler.postDelayed(new Runnable(){
            public void run(){
                autoUpdateContent();
                handler.postDelayed(this, delay);
            }
        }, delay);*/

    }

    public void updateLabelString(View arg0){
        dataModel.setText(editText.getText().toString());
    }

    public void autoUpdateContent(){
        if(dataModel.isChanged()){
            label.setText(dataModel.getText());
            dataModel.setChanged(false);
        }
    }

    private void observePresenter(){
        dataModel.addObserver(
                (o, arg)->label.setText(dataModel.getText())
        );
    }
}