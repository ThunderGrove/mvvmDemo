package com.example.mvvmdemo.view;

import com.example.mvvmdemo.presenter.ModelPresenter;
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

    ModelPresenter modelPresenter=new ModelPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observePresenter();
        editText=(EditText)findViewById(R.id.editText);
        label=(TextView)findViewById(R.id.label);
        button=(Button)findViewById(R.id.button);

    }

    public void updateLabelString(View arg0){
        modelPresenter.updateModel(editText.getText().toString());
    }

    private void observePresenter(){
        modelPresenter.addObserver(
                (o, arg)->label.setText(modelPresenter.getModel())
        );
    }
}