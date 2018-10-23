package com.example.gegoff.quizapp;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        int score =0;
        boolean one = ((RadioButton)findViewById(R.id.radioCorrectG)).isChecked();
        boolean two = ((RadioButton)findViewById(R.id.radioCorrectF)).isChecked();
        boolean three=false;
        if(((CheckBox)findViewById(R.id.Rocco)).isChecked()==false&&((CheckBox)findViewById(R.id.Fluffy)).isChecked()==false&&((CheckBox)findViewById(R.id.Android)).isChecked()==false){
            if(((CheckBox)findViewById(R.id.Sam)).isChecked()&&((CheckBox)findViewById(R.id.Oliver)).isChecked()){
                three=true;
            }
        }
        boolean four=false;
        String ans= ((EditText)findViewById(R.id.Edit)).getText().toString();
        ans=ans.toLowerCase();
        if(ans.equals("soccer")){
            four=true;
        }
        if(one){score++;}
        if(two){score++;}
        if(three){score++;}
        if(four){score++;}
        TextView YS = findViewById(R.id.Score);
        YS.setText("Your Score: "+score+"/4");

    }
}
