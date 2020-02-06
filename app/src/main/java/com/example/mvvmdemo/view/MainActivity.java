package com.example.mvvmdemo.view;

import com.example.mvvmdemo.model.DataModel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        label=(TextView)findViewById(R.id.label);
        button=(Button)findViewById(R.id.button);
    }

    public void updateLabel(View arg0){
        dataModel.setText(editText.getText().toString());
        label.setText(dataModel.getText());
    }
}